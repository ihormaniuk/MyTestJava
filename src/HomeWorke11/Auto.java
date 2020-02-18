package HomeWorke11;

public class Auto {
    int numbersOfHorsePower;
    int yearRelease;
    public Auto(int numbersOfHorsePower,int yearRelease){
      this.numbersOfHorsePower = numbersOfHorsePower;
      this.yearRelease = yearRelease;
    }
    public String toString(){
        return "Numbers Of Horse Power : "  + numbersOfHorsePower + "\n" +
                "" +  "Year Release : " + yearRelease;
    }
}
