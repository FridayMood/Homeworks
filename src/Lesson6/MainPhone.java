package Lesson6;

public class MainPhone {
    public static void main(String[] args) {
        Phone[] phone = new Phone [3];
        for (int i = 0; i<phone.length; i++)
        {
            phone[i] = new Phone();
            phone[i].print();
            phone[i].receiveCall("Ihar");
            phone[i].getNumber();
            System.out.println("Номер " + phone[i].getNumber());

        }
        phone[2].receiveCall("Ihar", 489706785);
        phone[1].sendMessage(64375669,48244779,43247789,65353478);
        Phone phonenew = new Phone(9876543, "Samsung", 77.65f);
        phonenew.print();
    }
}
