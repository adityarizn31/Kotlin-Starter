## KOTLIN STARTER

### Pendahuluan <br>

* Print & Println <br>
Penggunaan **Print** dan **Println**. Print digunakan untuk mencetak teks saja tanpa menambahkan baris baru sedangkan pada println digunakan untuk mencetak teks ke dalam layar atau konsol yang nantinya terdapat baris baru. Fungsi print ini secara internal memanggil fungsi **SOUT** pada bahasa pemrograman java.

* Komentar <br>
Terdapat contoh komentar dalam bahasa pemrogaman kotlin ini seperti halnya sama dengan bahasa pemrogaman java : 
1. // Single Line Comment : Merupakan komentar untuk satu baris saja
2. /*
  <br> Multi Line Comment : Digunakan untuk komentar panjang atau lebih dari satu baris
   <br> */ 

* Main <br>
Merupakan fungsi yang wajib digunakan untuk entry point yang otomatis akan dipanggil ketika program akan dijalankan

```kotlin
 fun main() {
        val name = "Aditya Rizkiawan"

     print("Hello my name is ") // mencetak teks saja tanpa menambah baris baru
     println(name) // mencetak teks ke dalam layar atau konsol akan menambah baris baru
     print(if (true) "Always True"
      else "Always False")
}
 /*
 Fungsi Print ini secara internal memanggil fungsi sout pada java
 berguna menampilkan pesan yang diberikan ke standard output stream
  */


 // Ini merupakan komentar (Single Line Comment)

 /*
 Ini merupakan komentar (Multi Line Comment)
  */

 // Main merupakan fungsi yang wajib digunakan untuk entry point yang otomatis akan dipanggil ketika program dijalankan

```

