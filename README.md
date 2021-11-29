# MovieApp


Unit Testing ViewModel
--
*MoviesViewModelTest:

    - Memuat Movies
        + Memastikan data movies tidak null.
        + Memastikan jumlah data movies sesuai dengan yang diharapkan.
    
    
*TvShowViewModelTest

    -Memuat TvShow
        + Memastikan data tvshow tidak null.
        + Memastikan jumlah data movies sesuai dengan yang diharapkan.
    
    
*DetailActivityViewModelTest

 -Memuat TvShow
        + Memastikan data tvshow tidak null.
        + Memastikan jumlah data movies sesuai dengan yang diharapkan.
        
 -Memuat Movies
       + Memastikan data movies tidak null.
       + Memastikan jumlah data movies sesuai dengan yang diharapkan.
    
    
Instrumental Testing ViewModel
--
  -Menampilkan data Movies
  
        + Memastikan rv_movies dalam keadaan tampil.
        + Gulir rv_movies ke posisi terakhir.
        
  -Menampilkan data TvShow
  
        + Memastikan rv_show dalam keadaan tampil.
        + Gulir rv_show ke posisi terakhir.
        
  -Menampilkan data detail Movies
  
        + Memberi tindakan klik pada data keenam di rv_movies
        + Memastikan TextView untuk name tampil sesuai yang di inginkan.
        + Memastikan TextView untuk release tampil sesuai yang di inginkan.
        + Memastikan TextView untuk synopsis tampil sesuai yang di inginkan.
        + Memastikan ImageView untuk images tampil sesuai yang di inginkan.
        + Memastikan ImageView untuk highlight tampil sesuai yang di inginkan.
        
  -Menampilkan data detail TvShow
  
        + Memberi tindakan klik pada data keenam di rv_show
        + Memastikan TextView untuk name tampil sesuai yang di inginkan.
        + Memastikan TextView untuk release tampil sesuai yang di inginkan.
        + Memastikan TextView untuk synopsis tampil sesuai yang di inginkan.
        + Memastikan ImageView untuk images tampil sesuai yang di inginkan.
        + Memastikan ImageView untuk highlight tampil sesuai yang di inginkan.
