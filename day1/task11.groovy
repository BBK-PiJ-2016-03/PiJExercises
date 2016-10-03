import groovy.transform.EqualsAndHashCode

//groovy is a dynamic language, I have implemented this solution in a non-dynamic way. In fact, add in some semi-colons, and this is pretty much java.

Main.main()

class Main{

	static final List<String> ranks = new ArrayList<>(Arrays.asList("1","2","3","4","5","6","7","8","9","10","J","Q","K"))
	static final List<String> suits = new ArrayList<>(Arrays.asList("Spades","Hearts","Diamonds","Clubs"))

	public static void main(){
		

		int cardsInFullHand = 5

		List<Card> cards = new ArrayList<>()

		while(cards.size() < cardsInFullHand){
			String rank = null;
			String suit = null;

			while(rank == null){
				rank = getRank(cards.size()+1, this.ranks);
			}

			while(suit == null){
				suit = getSuit(cards.size()+1, this.suits);
			}

			if(cards.contains(new Card(rank, suit))){		
				println "You have already got the " + rank + " of " + suit + " in your hand"
			}
			else{
				println "Card " + rank + " of " + suit + " added to hand"
				cards.add(new Card(rank, suit))
			}
			
		}

		println "The best hand you have is a " + Hand.checkHand(cards)
	}

	private static String toTitleCase(String input){
		if(input.size() == 0)
			return null

		if(input.size() == 1)
			return input.toUpperCase()

		return input[0].toUpperCase() + input.substring(1)
	}


	private static String getRank(int card, List<String> ranks){
		print "Please enter the card rank (1,2,3,4,5,6,7,8,9,10,J,K,Q) for card #" + card + ": "

		String input = toTitleCase(System.console().readLine())

		if(ranks.contains(input)){
			return input
		}
		
		println "That was not a valid rank"
		return null
	}


	private static String getSuit(int card, List<String> suits){
		print "Please enter the card suit ([S]pades, [H]earts, [D]iamonds, [C]lubs) for card #" + card + ": "

		String suit = "";

		String input = toTitleCase(System.console().readLine())
		if(suits.contains(input)){
			suit = input
		}
		else if(input.size() == 1){
			suit = getSuitFromKey(input)
		}
		else{
			println "That was not a valid suit"
		}

		return suit
	}

	//look, single point of return!
	private static String getSuitFromKey(String key){
		String suit = null
		switch(key){
			case "S":
				suit = "Spades"
				break
			case "H":
				suit = "Hearts"
				break
			case "D":
				suit = "Diamonds"
				break
			case "C":
				suit = "Clubs"
				break
			default:
				suit = null
				break
		}

		return suit
	}
}

//this works some magic and handles overriding both the equals and hashcode methods so that I could use List.contains
//bet it uses reflection.
@EqualsAndHashCode
public class Card{
	String rank = "";
	String suit = "";

	Card(String rank, String suit){
		this.rank = rank;
		this.suit = suit;
	}

	public String getRank(){
		return this.rank
	}

	public String getSuit(){
		return this.suit
	}
}


public class Hand{

	private static HashMap<String, Integer> rankCount
	private static boolean consecutive = false
	private static boolean sameSuit = false
	private static boolean threeOfAKind = false
	private static boolean pair = false
	private static int numPair = 0

	/*
	some programmers consider it poor practice to have multiple points of return from a method. 
	I personally don't think it's a problem if you keep your code clean and your functions short.
	In this instance, rewriting it to store the output in a var and have one return point would have
	made the code less readable (IMHO). Also writing if statements without brackets can result in
	hard to locate bugs. Not that you'd find any in MY code though. Right? ;)
	*/
	public static String checkHand(List<Card> cards){

		String rank = "rank"
		String suit = "suit"

		cards = sortCards(cards)

		if(isStraightFlush(cards))
			return "Straight Flush"

		if(isPoker(cards))
			return "Poker"

		if(isFullHouse(cards))
			return "Full House"

		if(isFlush(cards))
			return "Flush"

		if(isStraight(cards))
			return "Straight"

		if(isThreeOfAKind(cards))
			return "Three of a Kind"

		if(isTwoPair(cards))
			return "Two Pair"

		if(isPair(cards))
			return "Pair"

		return "Nothing"
	}

	private static boolean isStraightFlush(List<Card> cards){
		boolean sameSuit = true
		boolean consecutive = true
		String suit = cards[0].getSuit()
		int lastValue = -1

		for(card in cards) {

			if(card.getSuit() != suit){
				sameSuit = false;
				break
			}

			if(lastValue != -1 && getRankValue(card.getRank()) != lastValue + 1){
				consecutive = false
				break
			}

			lastValue = getRankValue(card.getRank())
		}

		this.consecutive = consecutive
		this.sameSuit = sameSuit

		return consecutive && sameSuit
	}

	private static boolean isPoker(cards){
		this.rankCount = countRanks(cards)

		for(count in this.rankCount.values()) {
			if(count == 4)
				return true			
		}

		return false
	}

	private static boolean isFullHouse(cards){

		boolean threeOfAKind = false
		boolean pair = false
		int numPair = 0

		for(count in this.rankCount.values()) {
			if(count == 3)
				threeOfAKind = true	

			if(count == 2){
				pair = true		
				numPair++	
			}
		}

		this.threeOfAKind = threeOfAKind
		this.pair = pair
		this.numPair = numPair

		return threeOfAKind && pair
	}

	private static boolean isFlush(cards){
		return this.sameSuit
	}

	private static boolean isStraight(cards){
		return this.consecutive
	}

	private static boolean isThreeOfAKind(cards){
		return this.threeOfAKind
	}

	private static boolean isTwoPair(cards){
		if(this.numPair == 2)
			return true

		return false
	}

	private static boolean isPair(cards){
		return this.pair
	}

	private static List<Card> sortCards(List<Card> cards){
		HashMap<String, Card> sorted = new HashMap<>()
		for(card in cards) {
			sorted[card.getRank()+card.getSuit()] = card
		}

		cards = new ArrayList<>(sorted.values())

		return cards
	}

	private static HashMap<String, Integer> countRanks(List<Card> cards){
		HashMap<String, Integer> count = new HashMap<>();

		for(card in cards) {
			if(count[card.getRank()] == null)
				count[card.getRank()] = 0

			count[card.getRank()]++
		}

		return count
	}

	private static int getRankValue(String rank){

		try{
			return Integer.parseInt(rank)
		}
		catch(NumberFormatException e){
			int value = -1
			switch(rank){
				case 'J':
					value = 10
					break

				case 'Q':
					value = 11
					break

				case 'K':
					value = 12
					break
			}

			return value
		}
	}
}