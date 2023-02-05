public class Teacher {

    String name;
    int teacherId;
    int year;

    void teacherYear(int year){
        this.year = year;
        System.out.println(""+year);
    }

    void teacherName(String name){
        this.name = name;
    }

    void teacherId(int id){
        this.teacherId = teacherId;

    }

    String teacherInfo(String name, int teacherId, int year){
        this.name = name;
        this.teacherId = teacherId;
        this.year = year;
        return name + " Teacher for: " + year + " ID: " + teacherId;
    }
}

class MathTeacher extends Teacher {
    int rate;

    void weeklyRate(){
        System.out.println(rate);
    }
}

class ChemistryTeacher extends Teacher{

    int titrations;

    void dailyTitrations(){
        System.out.println(titrations);
    }
}

class PianoTeacher extends Teacher{

    String pianist;
    void favoritePianist(){
        System.out.println(pianist);
    }
}
