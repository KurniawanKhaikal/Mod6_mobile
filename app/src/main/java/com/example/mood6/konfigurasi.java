package com.example.mood6;

class konfigurasi {

    //Dibawah ini merupakan Pengalamatan dimana Lokasi Skrip CRUD PHP disimpan
    public static final String URL_ADD="http://192.168.88.9/test/tambahPgw.php";
    public static final String URL_GET_ALL= "http:// 192.168.88.9/test/tampilSemuaPgw.php";
    public static final String URL_GET_EMP = "http://192.168.88.9/test/tampilPgw.php?id=";
    public static final String URL_UPDATE_EMP = "http://192.168.88.9/test/updatePgw.php";
    public static final String URL_DELETE_EMP = "http://192.168.88.9/test/hapusPgw.php?id=";

    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
    static final String KEY_EMP_ID = "id";
    static final String KEY_EMP_NAMA = "name";
    static final String KEY_EMP_POSISI = "desg"; //desg itu variabel untuk posisi
    static final String KEY_EMP_GAJIH = "salary"; //salary itu variabel untuk gajih

    //JSON Tags
    static final String TAG_JSON_ARRAY="result";
    static final String TAG_ID = "id";
    static final String TAG_NAMA = "name";
    static final String TAG_POSISI = "desg";
    static final String TAG_GAJIH = "salary";

    //ID karyawan
    //emp itu singkatan dari Employee
    static final String EMP_ID = "emp_id";
}