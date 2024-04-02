public class ComputerTest {// 模拟计算机对移动存储设备的读写操作
    public static void main(String[] args) {
        StorageDevice usb = new USB();
        StorageDevice mobilePhoneCard = new MobilePhoneCard();
        StorageDevice portableHardDrive = new PortableHardDrive();
        StorageDevice flashCard = new FlashCard();

        // 读取数据
        usb.readData();
        mobilePhoneCard.readData();
        portableHardDrive.readData();
        flashCard.readData();

        // 写入数据
        usb.writeData();
        mobilePhoneCard.writeData();
        portableHardDrive.writeData();
        flashCard.writeData();
    }
}
