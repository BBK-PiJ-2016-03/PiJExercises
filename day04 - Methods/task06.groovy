/*6 Integer
Create your own version of boxed int! Create a class Integer2 with only one field (int value) and the following
methods:*/

class Integer2{
    private int value = 0;

    //getValue(): returns the value of this number as an int, a getter.
    public int getValue(){
        return this.value;
    }

    //setValue(int): a setter.
    public void setValue(int value){
        this.value = value;
    }

    //isEven(): returns true if the number is even, false otherwise.
    public boolean isEven(){
        if(this.value % 2 == 0)
            return true;
        return false;
    }

    //isOdd(): the opposite.
    public boolean isOdd(){
        if(this.value % 2 != 0)
            return true;
        return false;
    }

    //prettyPrint(): prints the value of the integer on the screen.
    public void prettyPrint(){
        print(value);
    }

    //toString(): returns a String equivalent to the number.
    public String toString(){
        return value.toString();
    }
}


Integer2 i2 = new Integer2();

print "Enter a number: ";

String str = System.console().readLine();

int i = Integer.parseInt(str);

i2.setValue(i);

print "The number you entered is "

if (i2.isEven()) {
    println "even.";
}
else if (i2.isOdd()) {
    println "odd.";
}
else {
    println "undefined!! Your code is buggy!";
}

int parsedInt = Integer.parseInt(i2.toString());

if (parsedInt == i2.getValue()) {
    println("Your toString() method seems to work fine.");
}