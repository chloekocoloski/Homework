public class MadLib {
    String classmate;
    String city;
    String noun;
    String adjective;
    String pluralNoun;
    String pluralAnimal;
    boolean trueOrFalse;
    int decimalBiggerThan1;
    int number1;
    int number2;
    int wholeNumberBetween1and4;
    String miltonTeacher;
    String miltonDean;
    String letterGrade;
    String season;
    String story;
    String itemFromCamping;
    String historyClassTeacher;


    public static void main(String[] args) {
        System.out.println("@Leonard Stern and Roger Price");
        MadLib myStory = new MadLib();

    }// main method

    public MadLib(){
        classmate = "Libby";
        city = "Chicago";
        noun = "computer";
        adjective = "prickly";
        pluralNoun = "debit cards";
        pluralAnimal = "fox";
        trueOrFalse = true;
        decimalBiggerThan1 = 50;
        number1 = 1;
        number2 = 2;
        wholeNumberBetween1and4 = 3;
        miltonTeacher = "Mr. Torney";
        miltonDean = "Ms. Swain";
        letterGrade = "A";
        season = "winter";
        itemFromCamping = "poisonous mushroom";
        historyClassTeacher = "Mr. Furst's";

        story = "This weekend I am going camping with "
                +classmate+ ". We are going to a campsite in "
                +city+ ". I packed my "+noun+ " and "
                +pluralNoun + ". The forecast is calling for a high of "
                +decimalBiggerThan1+ " degrees fahrenheit. So it should be a "
                +adjective+" day! This year, the park rangers have seen "
                +number1+ " " +pluralAnimal + " which seems kind of dangerous. "
                +miltonTeacher+" said it's " + trueOrFalse + " that "+pluralAnimal+ " eat class "
                +wholeNumberBetween1and4+ " students in the " +season+ ". But, "
                +miltonDean+ " said it actually has only happened "
                +number2+" times. Wish us luck! If we survive, we will earn a "
                +letterGrade+ "- in P.E. class. However, if we bring a "
                +itemFromCamping+ " then we will be able to get a " +letterGrade+ " in "
                +historyClassTeacher+ " class."  ;
        System.out.println(story);

    }//constructor method



    }

