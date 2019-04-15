package pattern.behavioral.appearance;

/**
 * @Author linfei
 * @Date 2019/3/28 13:25
 * @Description
 */
public class Computer {
    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public Computer() {
        cpu  = new CPU();
        memory = new Memory();
        disk =new Disk();
    }

    public void startUp(){
        System.out.println("start the computer");
        cpu.startUp();
        memory.startUp();
        disk.startUp();
    }
    public void shutDown(){
        System.out.println(" shutDown the computer ");
        cpu.shutDown();
        memory.shutDown();
        disk.shutDown();
        System.out.println("  computer closed ");
    }
}
