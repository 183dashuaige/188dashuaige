 //定义一个接口表示移动存储设备
    interface StorageDevice{
        void readData();
        void writeData();
    }
    class USB implements StorageDevice{
        @Override
        public void readData() {
            System.out.println("从U盘读取数据");
        }

        @Override
        public void writeData() {
            System.out.println("向U盘写入数据");
        }
    }
    class MobilePhoneCard implements StorageDevice {
        @Override
        public void readData() {
            System.out.println("从手机卡读取数据");
        }

        @Override
        public void writeData() {
            System.out.println("向手机卡写入数据");
        }
    }

    class PortableHardDrive implements StorageDevice {
        @Override
        public void readData() {
            System.out.println("从移动硬盘读取数据");
        }

        @Override
        public void writeData() {
            System.out.println("向移动硬盘写入数据");
        }
    }

    class FlashCard implements StorageDevice {
        @Override
        public void readData() {
            System.out.println("从闪卡读取数据");
        }

        @Override
        public void writeData() {
            System.out.println("向闪卡写入数据");
        }
    }
