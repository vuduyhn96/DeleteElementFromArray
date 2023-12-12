import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khai báo và khởi tạo mảng số nguyên
        int[] array = {3, 5, 4, 10, 7, 1, 9, 6};

        // Bước 2: Nhập X là phần tử cần xoá
        System.out.print("Nhập phần tử cần xoá: ");
        int x = scanner.nextInt();

        // Bước 3: Tìm X và chỉ ra vị trí của X
        int indexDel = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                indexDel = i;
                break;
            }
        }

        if (indexDel != -1) {
            // Bước 4: Thực hiện xoá phần tử X khỏi mảng
            for (int i = indexDel; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }

            // Bước 5: Kết thúc duyệt mảng. In ra mảng
            array = Arrays.copyOf(array, array.length - 1);

            System.out.println("Mảng sau khi xoá phần tử " + x + ": " + Arrays.toString(array));
        } else {
            System.out.println("Phần tử " + x + " không xuất hiện trong mảng.");
        }
    }
    }

