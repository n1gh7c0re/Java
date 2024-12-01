public class Main {
    public static void main(String[] args) {
        // Преобразование String в StringBuffer и StringBuilder
        String str = "Hello, World!";
        StringBuffer stringBuffer = new StringBuffer(str);
        StringBuilder stringBuilder = new StringBuilder(str);

        System.out.println("StringBuffer: " + stringBuffer);
        System.out.println("StringBuilder: " + stringBuilder);

        // Преобразование StringBuffer и StringBuilder в String
        String strFromBuffer = stringBuffer.toString();
        String strFromBuilder = stringBuilder.toString();

        System.out.println("String from StringBuffer: " + strFromBuffer);
        System.out.println("String from StringBuilder: " + strFromBuilder);

        // Преобразование StringBuffer в StringBuilder
        StringBuilder stringBuilderFromBuffer = new StringBuilder(stringBuffer.toString());
        System.out.println("Converted StringBuilder from StringBuffer: " + stringBuilderFromBuffer);

        // Преобразование StringBuilder в StringBuffer
        StringBuffer stringBufferFromBuilder = new StringBuffer(stringBuilder.toString());
        System.out.println("Converted StringBuffer from StringBuilder: " + stringBufferFromBuilder);
    }
}
