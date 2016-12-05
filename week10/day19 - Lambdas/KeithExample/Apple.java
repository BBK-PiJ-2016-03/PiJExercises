public class Apple{
    private int weight;
    private Colour colour;

    public Apple(int weight, Colour colour){
        setWeight(weight);
        setColour(colour);
    }

    public int getWeight(){
        return this.weight;
    }

    public Colour getColour(){
        return this.colour;
    }

    private void setWeight(int weight){
        this.weight = weight;
    }

    private void setColour(Colour colour){
        this.colour = colour;
    }

    @Override
    public String toString(){
        return String.format("%s [%s]", this.colour, this.weight);
    }
} 