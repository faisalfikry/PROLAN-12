public class CabangYogya extends Yogya implements InterfaceCabang{

    @Override
    public void TampilMenu() {
        System.out.println("===================Data Cabang Yogya===============");
    }
    @Override
    public void DataCabang() {
        System.out.println("Nama Cabang       : " + getNamaCabang());
        System.out.println("Alamat Cabang     : " + getAlamatCabang());
        System.out.println("Keterangan Cabang : " + getKeterangan());
    }
    @Override
    public void PenutupBaris() {
        System.out.println("===================================================");
    }

}
