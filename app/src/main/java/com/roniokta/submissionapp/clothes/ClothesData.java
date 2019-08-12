package com.roniokta.submissionapp.clothes;

import java.util.ArrayList;

public class ClothesData {
    private static String[][] dataClothes = new String[][]{
            {"Gucci", "Gucci pertama kali dimiliki oleh multimilyuner Jerilos. Pada tahun 1938 Gucci mengembangkan dan butik dibuka di Roma. Sesudah kematiannya pada 1953, Aldo menjadi peranan perusahaan sebagai pemimpin tertinggi, dibuka perusahaan butik di London, Paris, dan New York. Gucci bertepatan di Timur Jauh untuk selanjutnya melakukan perluasan pada pertengahan 1960-an, membuka pertokoan di Hong Kong dan Tokyo."
                    , "https://cdn.shopify.com/s/files/1/2374/3709/products/GUCCI_THUMB_237af47c-c672-444b-bd49-5bf9b5d4b99b_1080x.jpg?v=1514073359"
                    , "https://www.gucci.com/int/en/"
                    , "https://n.nordstrommedia.com/ImageGallery/store/product/Zoom/0/_102256920.jpg"},
            {"Chanel", "Chanel S.A adalah perusahaan multinasional pribadi yang dimiliki oleh Alain Wertheimer dan Gerard Wertheimer, cucu dari Pierre Wertheimer, yang memiliki mitra bisnis awal dari couturiere Coco Chanel. Perusahaan ini didirikan pada tahun 1909, berbasis di Paris, Prancis. Perusahaan ini mempekerjakan 1.270 karyawannya pada tahun 2010 dan memiliki 310 lokasi di dunia.. Chanel S.A sebagai rumah adibusana berspesialisasi dalam haute couture dan pakaian siap pakai, barang mewah dan aksesoris mode. nama Chanel diambil dari nama pendirinya, Gabrielle Chanel yang memperoleh nama panggilan Coco semenjak dia menjadi biduanita. Sebagai perancang busana, Coco Chanel melayani selera wanita dalam berbusana dengan blus dan jas, celana panjang dan gaun, dan perhiasan (bijouterie) berdesain sederhana, yang menggantikan pakaian dan aksesori konstruktif dan mewah dari busana abad ke-19. Merek-merek produk Chanel telah dipersonifikasikan oleh model busana dan aktris, seperti Ines de La Fressange, Catherine Deneuve, Carole Bouquet, Vanessa Paradis, Nicole Kidman, Anna Mouglalis, Audrey Tautou, Keira Knightley, Kristen Stewart dan Marilyn Monroe.\n" +
                    "\n" +
                    "Rumah Chanel dikenal karena \"little black dress\", parfum No.5 de Chanel, dan The Chanel Suit. Chanel merevolusi adibusana (haute couture) dan mode sehari-hari (ready to wear) - mengganti siluet dan korset dengan pakaian yang fungsional serta dapat menyanjung sosok wanita itu.\n" +
                    "\n" +
                    "Sekitar 1920-an, Chanel telah membuat populer mode \"berdada rata\" yang merupakan kebalikan dari figur jam pasir yang sebelumnya menjadi tren pada akhir abad 19 - the Belle Epoque dari Prancis (kurang lebih 1890-1914), dan Era Edwardian Inggris (kurang lebih 1901-1919). Chanel menggunakan warna abu-abu dan biru laut sebagai bentuk asosiasi dari maskulinitas di Eropa, untuk menunjukkan keberanian feminitas. Pakaian Rumah Chanel menampilkan kain berlapis dan hiasan kulit, konstruksi berlapis memperkuat kain, desain dan finishing, menghasilkan pakaian yang mempertahankan bentuk dan fungsinya saat dikenakan. Sebagai contoh seperti teknik adibusana adalah woolen Chanel suit - rok setinggi lutut dan jaket kardigan yang dipotong dan didekorasi dengan bordiran hitam dan kancing bewarna emas. Aksesoris pelengkap berupa two-tone pump shoes dan perhiasan, biasanya kalung mutiara dan tas kulit."
                    , "https://upload.wikimedia.org/wikipedia/id/thumb/9/92/Chanel_logo_interlocking_cs.svg/1200px-Chanel_logo_interlocking_cs.svg.png"
                    , "https://www.chanel.com/en_SG/"
                    , "https://assets.therealreal.com/prismic/the-realreal/2e1c0582e3a83cb08146fc521365abdde8c7c6e5_designer_chanelw.jpg"},
            {"Dior", "Christian Dior SE (pelafalan bahasa Prancis: [kʁis.tjɑ̃ djɔːʁ]), umumnya dikenal sebagai Dior, adalah perusahaan barang mewah Prancis yang dikendalikan dan diketuai oleh pengusaha Prancis Bernard Arnault, yang juga mengepalai LVMH, grup mewah terbesar di dunia. Dior sendiri memiliki 42,36% saham dan 59,01% hak suara dalam LVMH. Sidney Toledano telah menjadi CEO sejak 1997\n" +
                    "\n" +
                    "Perusahaan ini didirikan pada tahun 1946 oleh desainer Christian Dior. Saat ini ia mendesain dan menjual barang-barang kulit, aksesoris fesyen, alas kaki, perhiasan, arloji, pewangi, tata rias, dan produk perawatan kulit, sembari mempertahankan tradisi sebagai pencipta haute-couture di bawah divisi Christian Dior Couture. Label Christian Dior sebagian besar tetap untuk penawaran wanita, meskipun perusahaan juga mengoperasikan divisi Dior Homme untuk pria dan label bayi Dior untuk pakaian anak-anak. Produk dijual di seluruh portofolio toko ritelnya di seluruh dunia, juga melalui toko online-nya."
                    , "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a8/Dior_Logo.svg/1280px-Dior_Logo.svg.png"
                    , "https://www.dior.com/en_int"
                    , "https://www.dior.com/couture/var/dior/storage/images/pushs-editos/folder-dior-men-winter-1920-push-editos/block-winter-19-look-duo-teeshirt-dior-pettibon/17867637-1-fre-FR/winter-19-look-duo-teeshirt-dior-pettibon_1440_1200.jpg"},
            {"Zara", "Zara adalah salah satu merek yg berasal dari Spanyol dan bermarkas di Arteixo, Gallicia. Zara didirikan pada tahun 1975 oleh Armancio Ortega dan Rosallia mera. Zara sendiri merupakan flagship store dari Inditex, yg juga memiliki beberapa merek ternama lainnya seperti:Massimo Dutti, Pull and Bear, Oysho, Uterqüe, Stradivarius dan Bershka.\n" +
                    "\n" +
                    "Zara sendiri hanya membutuhkan waktu kurang lebih 2 minggu untuk mengembangkan produk-produk barunya dan meluncurkan sekitar 10.000 design baru setiap tahunnya. Armancio ortega pertama kali membuka Zara Store di sebuah jalan utama di pusat kota A Coruña, Galicia, Spanyol. Toko tersebut ternyata cukup sukses, sehingga Armancio membuka beberapa store lagi di Spanyol. Selama tahun 1980, Ortega mulai mengubah desain, manufaktur dan proses distribusi untuk mengurangi lead time dan bereaksi terhadap tren baru dalam cara yang lebih cepat, dalam apa yang ia sebut \"mode instan\". Pada tahun 1980, perusahaan mulai melakukan ekspansi internasional melalui Porto, Portugal. Pada tahun 1989 mereka memasuki Amerika Serikat dan Prancis pada tahun 1990. Dan hingga saat ini, Zara sudah terdapat di 73 negara di Dunia termasuk di Indonesia. Zara memiliki beberapa jenis pakaian, mulai dari Wanita (Woman dan TRF), Pria (Men), anak-anak (Zara Kids), Zara Home hingga kosmetik. Store Zara paling banyak berada di Spanyol (329 toko), dan Prancis (114 Toko). Sementara di Indonesia, Zara hanya ada 13 toko."
                    , "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fd/Zara_Logo.svg/1200px-Zara_Logo.svg.png"
                    , "https://www.zara.com/id/"
                    , "https://s2.r29static.com//bin/entry/550/0,0,2000,2400/720x864,85/1640655/image.webp"},
            {"Supreme", "Supreme adalah toko skateboard Amerika dan merek pakaian yang didirikan di New York City pada bulan April 1994. Merek desainer melayani skateboarding, dan budaya hip hop, serta budaya pemuda pada umumnya. Merek desainer memproduksi pakaian dan aksesoris dan juga memproduksi skateboard."
                    , "https://fontmeme.com/images/Supreme-Logo.jpg"
                    , "https://www.thefthing.com/brand/Supreme"
                    , "https://static.fashionbeans.com/wp-content/uploads/2015/03/47m.jpg"},
            {"Prada", "Rumah mode Prada didirikan pada tahun 1913 di Milan dengan produk berupa barang-barang dari kulit.[2] Si pendiri, Mario Prada memang menciptakan produk kulit mewah yang mewah untuk kalangan kaya dan berpengaruh.[3] Awalnya Prada hanya memiliki 2 buah butik di kota Milan yang mennjual tas, sepatu, dan koper kulit.Koper Prada yang ada saat itu terbuat dari kulit walrus yang berat dan sulit dipakai untuk perjalanan udara.Oleh karena itu, Prada mulai beralih membuat koper yang ringan, terbuat dari bahan kayu, kristal, dan bahkan kulit kerang. Pada tahun 1978, Mario menyerahkan bisnisnya kepada cucunya, Miuccia Prada. Walupun Miuccia Prada tidak memiliki latar belakang pendidikan mode, tetapi dia bersama suaminya, Patrizio Bertelli, berhasil mengembangkan dan memperluas bisnis Prada. Patrizio Bertelli mengambil alih manajemen Prada, sementara Miuccia berkonsentrasi pada desain dan membuat tampilan baru Prada. Untuk mengatasi penjualan yang menurun, Miuccia sempat mengeluarkan beberapa koleksi terbaru seperti ransel tahan air hitam dari nilon yang disebut \"Pocone\", namun tidak banyak berpengaruh. \n" +
                    "\n" +
                    "Popularitas dan penjualan Prada mulai berkembang pesat pada tahun 1989, ketika Miuccia membuat koleksi \"Pret-a-porter\" yang elegan, terbuat dari kain mewah, memiliki warna dasar, dan desain sederhana dengan garis-garis yang bersih. Pada tahun 1990-am, Prada telah menjadi kekuatan utama dalam dunia mode, baik melalui gaun rancangannya yang seksi, tas indah, sepatu, dan berbagai aksesoris. Pada tahun 1992, Miuccia membuat merek Miu Miu yang diciptakan untuk konsumen muda dengan harga lebih terjangkau dan tidak beberapa kemudian diluncurkan Prada Sport Label, koleksi pakaian pria, dan pakaian dalam wanita."
                    , "https://cdn11.bigcommerce.com/s-sq9zkarfah/images/stencil/1280x1280/products/102746/136761/Prada-Logo-Decal-Sticker__02140.1510914038.jpg?c=2?imbypass=on"
                    , "https://www.prada.com/en.html?cc=AP"
                    , "https://images.bergdorfgoodman.com/ca/1/product_assets/N/5/G/G/6/BGN5GG6_mu.jpg"},
            {"Versace", "Gianni Versace S.p.A. (diucapkan [ˈdʒɑnːi verˈsatʃe]), lebih dikenal dengan Versace, adalah perusahan pakaian Italia yang didirikan oleh Gianni Versace pada tahun 1978. Setelah Gianni Versace dibuhuh oleh Andrew Cunanan pada 15 Juli 1997, adik perempuannya, Donatella Versace, yang sebelumnya berperan sebagai wakil presiden, menjadi direktur kreatif perancangan busana Versace, dan kakaknya, Santo Versace, menjadi CEO.\n" +
                    "\n" +
                    "Butik pertama Versace dibuka pada tahun 1978 di Via della Spiga Milan pada 1978, dan menjadi populer. Kini, Versace menjadi salah satu rumah mode internasional terdepan. Versace merancang, memasarkan, dan mendistribusikan pakaian mewah, aksesori, wewangian, dan kosmetik melalui berbagai merek di bawah Grup Versace."
                    , "https://upload.wikimedia.org/wikipedia/id/b/b2/Versace.png"
                    , "https://www.versace.com/international/en/home/"
                    , "https://www.millionpiece.com/wp-content/uploads/2019/02/Versace-clothes-for-women-1-1140x1600.png"},
            {"Fendi", "Fendi adalah rumah mode Italia yang terkenal atas tas tangan \"baguette\".Fendi berdiri pada tahun 1918 sebagai toko bulu dan kulit di Rom, tetapi sekarang ialah brand mewah multinasional yang dimiliki oleh LVMH, dengan Karl Lagerfeld sebagai direktur kreatif.\n" +
                    "\n" +
                    "Fendi dibentuk oleh Adele Casagrande, sebuah pernikahan dengan Edoardo Fendi membuat perubahan nama dan dibentuklah perusahaan seperti sekarang, Fendi pada tahun 1925. Bisnis ini berjalan baik dan butik-butik di luar Roma dibuka pada tahun 1930 dan 1940. Pada 1946, anak perempuan Adele dan Edoardo bergabung dengan bisnis keluarga dan mengahadirkan ide baru bagi produk yang dikeluarkan.\n" +
                    "\n" +
                    "Hingga sekarang, Fendi mengeluarkan berbagai produk pakaian, aksesoris baik untuk wanita, pria, dan anak-anak, seperti parfum, kacamata, jam tangan, dan CASA"
                    , "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a1/Fendi_logo.svg/1280px-Fendi_logo.svg.png"
                    , "https://www.fendi.com/"
                    , "http://d3ba08y2c5j5cf.cloudfront.net/wp-content/uploads/2018/03/27192247/02_FENDI-and-NAP-Capsule-Collection-images-644x806.jpg"},
            {"H&M", "Hennes & Mauritz AB merupakan sebuah perusahaan multinasional yang memproduksi busana. Perusahaan ini didirikan pada tahun 1947. Perusahaan ini menghasilkan berbagai macam produk pakaian. Bermarkas di Stockholm. Beroperasi lebih dari 28 negara dan mempekerjakan 60.000 pekerja."
                    , "https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/H%26M-Logo.svg/709px-H%26M-Logo.svg.png"
                    , "https://www2.hm.com/en_asia4/index.html"
                    , "https://lp2.hm.com/hmgoepprod?set=source[/e9/b7/e9b760a3f1d4bda3c077c95aedd5127053ba2514.jpg],origin[dam],category[ladies_cardigansjumpers_cardigans],type[LOOKBOOK],res[z],hmver[1]&call=url[file:/product/main]"},
            {"Mango", "Mango, biasa ditulis MANGO, adalah sebuah perusahaan desain dan manufaktur pakaian yang didirikan di Barcelona, Catalonia (Spanyol). Isak Andic saat ini menjabat sebagai presidennya dan Enric Casi menjabat sebagai pimpinan eksekutif.\n" +
                    "\n" +
                    "Tujuannya adalah \"berdiri di setiap kota\" di dunia. Perusahaan ini memiliki lebih dari 2.000 toko di 103 negara. Situs web pertamanya dibuat tahun 1995 dan pada tahun 2000, perusahaan ini membuka toko daring pertamanya. Mango mempekerjakan lebih dari 8.600 karyawan, 1.850 di antaranya bekerja di Hangar Design Centre dan kantor pusat Mango di Palau Solità i Plegamans (Barcelona). Meski merupakan perusahaan Spanyol dan memiliki banyak toko di Spanyol, terutama Madrid, kota Istanbul di Turki adalah salah satu kota dengan jumlah toko Mango terbanyak di dunia.\n" +
                    "\n" +
                    "H. E. by Mango adalah jajaran produk pria yang diluncurkan tahun 2008. Saat ini, parfum buatan Mango dimiliki oleh Puig.\n" +
                    "\n" +
                    "Sejak musim gugur 2011, Kate Moss menjadi duta Mango. Ia pertama muncul di video yang menampilkan Terry Richardson yang merekam keseluruhan kampanye dan menyutradarai iklan ini. Selanjutnya ia digantikan oleh model asal Australia Miranda Kerr\n" +
                    "\n" +
                    "Pada bulan April 2011, Putri Letizia mengunjungi kantor pusat perusahaan mengenakan pakaian Mango."
                    , "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1c/Logo_of_Mango_%28new%29.svg/200px-Logo_of_Mango_%28new%29.svg.png"
                    , "https://shop.mango.com/id"
                    , "https://st.mngbcn.com/rcs/pics/static/T4/fotos/S20/43027712_56.jpg?ts=1552984418907&imwidth=329&imdensity=1"},
            {"Pull & Bear", "Pull & Bear adalah pengecer pakaian dan aksesoris Spanyol yang berbasis di Narón, Galicia. Didirikan pada tahun 1986 sebagai New Wear, S.A. dan secara resmi diluncurkan sebagai Pull & Bear pada tahun 1991. Ini adalah bagian dari Inditex, pemilik merek Zara dan Oysho"
                    , "https://mall-api.gotomalls.com/uploads/retailers/logo/KsOW2_LOVFt3mz-Y-1924-pull-bear-1521531279_1.jpg"
                    , "https://www.pullandbear.com/id/"
                    , "https://images.asos-media.com/products/pullbear-bomber-jacket-in-green/9754396-1-khaki?$XXL$&wid=513&fit=constrain"},
            {"Balenciaga", "Balenciaga merupakan rumah mode Prancis yang didirikan oleh Cristóbal Balenciaga, seorang perancang busana keturunan Spanyol, yang lahir di Basque Country, Spain. Balenciaga memiliki reputasi sebagai penjahit pakaian yang tak kenal kompromi dalam penetapan standar dan dikaitkan sebagai \"the master of us all\" oleh Christian Dior. Ciri khas dari produk Balenciaga ialah bubble skirts and odd, feminine, tetapi masih berbentuk ultra-modern.\n" +
                    "\n" +
                    "Brand Balenciaga kini dimiliki oleh perusahaan multinasional asal Prancis yakni K. Saat ini Direktur Kreatif Balenciaga ialah Alexander Wang."
                    , "https://upload.wikimedia.org/wikipedia/id/thumb/d/d7/Balenciaga2017Logo.svg/128px-Balenciaga2017Logo.svg.png"
                    , "https://www.balenciaga.com/id"
                    , "https://www.balenciaga.com/66/12/12354422PN_10_a_g.jpg"},

    };

    public static ArrayList<Clothes> getListClothesData() {
        ArrayList<Clothes> list = new ArrayList<>();
        for (String[] cData : dataClothes) {
            Clothes clothes = new Clothes();
            clothes.setNameClothes(cData[0]);
            clothes.setInfoClothes(cData[1]);
            clothes.setClothesBadge(cData[2]);
            clothes.setShopClothes(cData[3]);
            clothes.setPhotoClothes(cData[4]);
            list.add(clothes);
        }
        return list;
    }
}
