# Java net
Học lập trình mạng
# Mục lục
 

 1. Lớp InetAddress
 2. Lớp Socket

# I.Mở đầu:
 ## Lớp InetAddress
  ###Vì địa chỉ IP address theo số IP và theo trên rất thường dùng khi kết nối vào mạng cho nên Java xây dựng hẳn một lớp **InetAddress** dành riêng cho việc quản lí địa chỉ theo tên vào theo số.
  ###Lớp InetAddress cung cấp cho chúng ta các phương thức thông dụng dùng để chuyển đổi và truy xuất địa chỉ IP (Class này không có hàm khởi tạo), thông thường ta thường dùng đến các phương thức sau:
- **public static InetAddress getLocalHost()** trả về một đối tượng InetAddress là địa chỉ của máy cục bộ.
- **public static InetAddress getByName(String host)** phương thức này nhận tham số đầu vào tên một host, trả về một đối tượng InetAddress là một địa chỉ IP của host ấy (VD : "www.google.com" => "74.125.200.105"
 - **public static InetAddress[] getAllByName(String host)** phương thức này nhận tham số đầu vào tên một host, trả về một mảng InetAddress thay mặt cho địa chỉ của host ấy (VD: "www.google.com" => InetAddress[]:www.google.com/74.125.200.106
InetAddress[]:www.google.com/74.125.200.104
InetAddress[]:www.google.com/74.125.200.147
InetAddress[]:www.google.com/74.125.200.99
InetAddress[]:www.google.com/74.125.200.105
InetAddress[]:www.google.com/74.125.200.103)