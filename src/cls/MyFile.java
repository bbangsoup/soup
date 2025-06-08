package cls;

public class MyFile {
    private String fileName;
    private int fileSize;

    public MyFile(){
        fileName = "";
        fileSize = 0;
    }

    public MyFile(String fileName, int fileSize){
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    // 각 필드에 대해서 각각 setter와 getter를 정의하세요
    public void setFileName(String fileName){
        this.fileName = fileName;
    }

    public String getFileName(){
        return this.fileName;
    }

    public void setFileSize(int fileSize){
        this.fileSize = fileSize;
    }

    public int getFileSize(){
        return this.fileSize;
    }

    public String toString() {
        return String.format("fileName : %s\n fileSize : %d", fileName, fileSize);
    }
    public boolean equals(Object o) {
        if( o == null || getClass() != o.getClass() )
            return false;

        MyFile target = (MyFile) o;

        return getFileName().equals(target.getFileName()) &&
                this.fileSize == target.fileSize;
    }
}
