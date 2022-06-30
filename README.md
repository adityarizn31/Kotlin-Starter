# Kotlin - Starter

### Day 4

* Functions <br>
Fungsi merupakan sebuah prosedur yang memiliki keterkaitan dengan pesan dan objek. **Ketika kita memanggil sebuah fungsi maka sebuah mini program akan dijalankan**. Sebuah fungsi digunakan untuk mengembalikan nilai, pemanggilan sebuah fungsi sendiri bisa diberikan argumen atau tidak. 
```kotlin
fun functioname (param1: Type1, param2: Type2, ... ) : ReturnType {
    Return result
}
```

Pendeklarasian kotlin diawali dengan kata kunci **fun** kemudian dilanjutkan dengan nama fungsi yg dikehendaki. 

* Parameter <br>
Merupakan fungsi yang di deklarasikan dengan diawali nama parameter dan diikuti dengan tipe parameter itu sendiri yang dipisahkan oleh colon (:) <br>
```kotlin
fun setUser (name : String, age : int)
```

Setelah menentukan nama dan parammeter selanjutnya menentukan tipe kembalian dari fungsi yang dibuat
```kotlin
fun setUser (name : String, age : Int) : String
```
Fungsi di atas mengembalikan nilai berupa string. Dilanjutkan dengan menentukan tipe nilai kembalian dan baru kita menentukan function body yang terdapat dalam expression atau statement untuk dijalankan. **Function Body** berada di dalam <i> curly braces </i> ( {} )
```kotlin
fun setUser (name : String, age : Int) : String {
return " Nama mu $name dan umur mu $age tahun"
}
```
Nilai yang akan dikembalikan diikuti oleh kata kunci return. 

* Penulisan Return
