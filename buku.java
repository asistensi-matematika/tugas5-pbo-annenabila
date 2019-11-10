/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5;

/**
 *
 * @author DELL
 */
public class buku extends perpustakaan {
    private String judul, pengarang, jenis;
    private int halaman;

    public buku() {
        judul = "kosong";
        pengarang = "kosong";
        halaman = 0;
        jenis = "kosong";
    }

    public buku(String judul, String pengarang, String jenis, int halaman) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.halaman = halaman;
        this.jenis = jenis;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public int getHalaman() {
        return halaman;
    }

    public void setHalaman(int halaman) {
        this.halaman = halaman;
    }
    
    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    public void print() {
        System.out.println("judul = " + judul + "\npengarang = " + pengarang+ "\nhalaman = " + halaman + "\njenis = " + jenis);
    }
    
    public String printt() {
        return "judul = " + judul + "\n | pengarang = " + pengarang+ "\n | halaman = " + halaman + "\n | jenis = " + jenis;
    }
    
    public String jarak() {
        return "                                                                   "
                + "";
    }
    
}
