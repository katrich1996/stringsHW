import java.util.Locale;

///task1-3
class HW {
    public static void main(String[] args) {
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
        String strUpper = fullName.toUpperCase(Locale.ROOT);
        fullName = fullName.replace(" ", "; ");
        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullName);
        System.out.println("”Данные ФИО сотрудника для заполнения отчета — " + strUpper);
    }
}
///task4
class dsa {
    public static void main(String[] args) {
        String firstName = "Семён ";
        String middleName = "Семёнович ";
        String lastName = "Иванов ";
        String fullName = lastName + firstName + middleName;
        String[] split = fullName.split(" ");
        for (int i = 0; i < split.length; i++) {
            split[i] = split[i].replace("ё", "е");
        }
        System.out.println("Данные ФИО сотрудника "+split[0]+" "+split[1]+ " " +split[2]+ " ");
    }
}