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
        System.out.println("������� ��� ���������� ��� ���������� ������ �" + strUpper);
    }
}
