	Dalam Program Supermarket Ini terdapat Tiga class, Yang pertama :
Class KaryawanYogya --> Sebagai Kakek
Class Yogya --> Sebagai Bapak
Class MainSupermarket --> Sebagai Anak

>> Dalam class KaryawanYogya Ini terdapat Atribut yang bernama : String NamaKaryawan, Pass, Alamat, Ttl;  int Umur; char JenisK; 
dan dimana didalam class tersebut terdapat method-method seperti void Tampil_data, void Tambah_data, void Tambah_Ttl, void Tambah_JenisK, void Tambah_Pass.
>> Kemudian pada class Yogya ini akan menampilkan data yang ada di si kakek menggunakan Syintax "extends" dari class KaryawanYogya. di class Yogya juga terdapat beberapa atribut
seperti String KodeBarang = "501"; String NamaPekerjaan, NamaBarang, Expire; namun pada KodeBarang ini saya sudah menginputkan data berupa String "501". kemudian, pada class Yogya ini 
akan memanggil method yang bernama Tampil_data yang mana method itu awalnya ada di class KaryawanYogya(kakek).
>> MainSupermarket, class ini juga mempunyai sebuah atribut2 pada class MainSupermarket ini akan memanggil sebuah method dari class bapa yang bernama Yogya dengan menggunakan syntax extends dimana di class tersebut akan 
menampilkan Tampil_data. 