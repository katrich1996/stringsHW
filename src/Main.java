import java.util.Locale;

///task1-3
class HW {
    public static void main(String[] args) {
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("������ ��� ���������� ��� ���������� ������ � " + fullName);
        String strUpper = fullName.toUpperCase(Locale.ROOT);
        fullName = fullName.replace(" ", "; ");
        System.out.println("������ ��� ���������� ��� ����������������� ������ � " + fullName);
        System.out.println("������� ��� ���������� ��� ���������� ������ � " + strUpper);
    }
}
///task4
class dsa {
    public static void main(String[] args) {
        String firstName = "���� ";
        String middleName = "�������� ";
        String lastName = "������ ";
        String fullName = lastName + firstName + middleName;
        String[] split = fullName.split(" ");
        for (int i = 0; i < split.length; i++) {
            split[i] = split[i].replace("�", "�");
        }
        System.out.println("������ ��� ���������� "+split[0]+" "+split[1]+ " " +split[2]+ " ");
    }
}