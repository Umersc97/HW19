public class TeacherTester {
    public static void main(String[] args) {

        Teacher tc = new Teacher();
        tc.name = "Mark";
        tc.teacherId = 4739;

        MathTeacher mt = new MathTeacher();
        mt.name = "Harold";
        mt.teacherId = 1928;
        mt.year = 10;
        mt.rate = 40;

        ChemistryTeacher ct = new ChemistryTeacher();
        ct.name = "Jerome";
        ct.teacherId = 6473;
        ct.year = 2;
        ct.dailyTitrations();

        PianoTeacher pt = new PianoTeacher();
        pt.name = "Lina";
        pt.teacherId = 6858;
        pt.year = 4;
        pt.favoritePianist();

    }
}
