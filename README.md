# -Challenge-Classes-Product-Inventory-Project-
Đề bài: Product Inventory Project 
  Create an application which manages an inventory of products. Create a product class which has a price, id, and quantity on hand. Then create an inventory class which keeps track of various products and can sum up the inventory value.
  
Cách giải:
1. 
  Tạo class Product có các thuộc tính id, price, quantity. 
  Tạo các Constructor, getter, setter. 
  Overide toString() để in ra Product theo ý muốn.
2. 
  Tạo class Inventory để quản lý Product.
  Khởi tạo 1 ArrayList là listProduct để chứa các đối tượng product có trong kho.
  Viết các hàm cần thiết để quản lý product: 
    - addProduct(int id, double price, int quantity): dùng để thêm product làm dữ liệu mẫu.
    - addProduct(): dùng để thực hiện chức năng thêm 1 product.
    - checkId(int id): dùng để kiểm tra có product nào có id tồn tại trong listProduct hay chưa. Trả về false nếu đã tồn tại id, ngược lại
    - removeProduct(): dùng để xóa 1 product. Phải kiểm tra xem product có tồn tại trong listProduct không rồi mới xóa.
    - displayListProduct(): chạy vòng for để in ra tất cả product trong listProduct.
    - sumInventory(): tính tổng giá trị của tất cả product trong kho.
3.
  Tạo class Main để tạo chương trình demo.
  Khai báo 1 đối tượng Inventory.
  Gọi hàm addProduct() để thêm 1 vài dữ liệu mẫu.
  Khai báo 1 biến condition = true làm điều kiện cho vòng while.
  Tạo vòng while(condition) chạy cho đến khi condition = false.
  In ra Menu...
  switch case để thực hiện các yêu cầu trong menu.
    
