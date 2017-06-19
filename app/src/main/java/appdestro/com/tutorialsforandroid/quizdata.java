package appdestro.com.tutorialsforandroid;


public class quizdata {



    public String question[]={
            "who is developer of android?",
            "what is extension of .apk?" ,
            " What is an infinite loop? ",
            "A compound statement is: ",
            "Android Application Can be developed in?",
            "New Language Introduced in Android is?",
            "what was first phone that ran android os?",
            "Google licensed some proprietary apps",
            "When did Google purchsed android?",
            "what is nickname of android version?",
            "which code is not open source in android?"

    };

    private String choice[][]={
            {"andy rubin","mark","steve"},
            {"application pacakage","application","nothing"},
            {"A loop that functions infinitely well","A loop that runs forever ","A loop that never starts "},
            {"A collection of more statements enclosed in braces ","A statement involving if and else","None of Above"},
            {"Eclipse","Android Studio","All of the Above"},
            {"Java","c++","Kotlin"},
            {"HTC","T-MobileG1 ","Lenovo"},
            {"True","False","None of the above"},
            {"2000","1997","2005"},
            {"cupcake","Muffin","gingerbread"},
            {"keypad driver","wifi driver","audio driver"}
    };


    private String correctans[]={
"andy rubin","application pacakage","A loop that runs forever ","A collection of more statements enclosed in braces ","All of the Above","Kotlin","T-MobileG1 ","True","2005","Muffin","wifi driver"
    };

    public String getque(int a)
    {
            String questions=question[a];
        return questions;

    }
public  String getchoices1(int a)
{
    String choicess1=choice[a][0];
    return choicess1;
}

    public int getLength(){
        return question.length;
    }

    public  String getchoices2(int a)
    {
        String choicess2=choice[a][1];
        return choicess2;
    }

    public  String getchoices3(int a)
    {
        String choicess3=choice[a][2];
        return choicess3;
    }

public  String getcans(int a)
{
    String answer=correctans[a];
    return answer;
}
}
