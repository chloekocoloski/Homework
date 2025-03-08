public class Conditionals {
    int questionRandomInt;
    int answerRandomInt;

    public static void main(String[] args) {
        Conditionals MagicEightBalls = new Conditionals();
        MagicEightBalls.ifStatements();
    }

    public Conditionals(){
        questionRandomInt = (int)(Math.random()*20);
        answerRandomInt = (int)(Math.random()*9);
    }

    public void ifStatements(){

        System.out.println("Welcome to the Online Magic 8 Ball!");
        System.out.println();

        if (questionRandomInt <= 5){
            System.out.println("Should I find a better source for my answers?");
        } else if (questionRandomInt > 5 && questionRandomInt <= 10){
            System.out.println("Is this my ultimate destiny?");
        } else if (questionRandomInt > 10 && questionRandomInt <= 15){
            System.out.println("Is this my ultimate destiny?");
        } else if (questionRandomInt > 15 && questionRandomInt <= 20){
            System.out.println("Should I believe in my latest dream?");
        }

        if (answerRandomInt <= 1){
            System.out.println("Without a doubt.");
        } else if (answerRandomInt > 1 && answerRandomInt <= 3){
            System.out.println("Better not tell you now.");
        } else if (answerRandomInt > 3 && answerRandomInt <= 5){
            System.out.println("Very doubtful.");
        } else if (answerRandomInt > 5 && answerRandomInt <= 7){
            System.out.println("As I see it, yes.");
        } else if (answerRandomInt > 7 && answerRandomInt <= 9){
            System.out.println("Uh... no.");
        }
    }

}

