package optional;


import java.util.Optional;

/**
* Optional ����һ�������࣬����һ��ֵ���ڻ򲻴��ڣ�
* ԭ���� null ��ʾһ��ֵ�����ڣ����� Optional��
* ���Ը��õı���������ҿ��Ա���[��ָ���쳣]
* (https://so.csdn.net/so/search?q=��ָ���쳣&spm=1001.2101.3001.7020)
*
*/
public class OptionalClass {
    public static void main(String[] args) {
        // ����һ�� Optional ʵ��
        Optional<String> op1 = Optional.of("Hello,World");

        // ����һ���յ� Optional ʵ��
        Optional<Object> op2 = Optional.empty();

        // ��������Ϊ null������ Optional ʵ�������򴴽���ʵ��
        Optional<Object> op3 = Optional.ofNullable(null);

        // �ж��Ƿ����ֵ
        boolean isPresent = op1.isPresent();
        System.out.println(isPresent);

        // ������ö������ֵ�����ظ�ֵ�����򷵻ز���
        Object orElse = op2.orElse("Hello,World");
        System.out.println(orElse);

        // ������ö������ֵ�����ظ�ֵ�����򷵻� s ��ȡ��ֵ
        Object orElseGet = op3.orElseGet(() -> 10 + 20);
        System.out.println(orElseGet);

        // �����ֵ���䴦�������ش�����Optional�����򷵻� Optional.empty()
        Optional<String> op4 = op1.map((s) -> s.toUpperCase());
        System.out.println(op4.get());
    }
}