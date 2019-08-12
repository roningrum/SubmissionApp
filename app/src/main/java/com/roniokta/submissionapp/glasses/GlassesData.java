package com.roniokta.submissionapp.glasses;

import java.util.ArrayList;

public class GlassesData {
    private static String[][] glassesData = new String[][]{
            {"Oakley", "\n" +
                    "Oakley, Inc., yang berbasis di Lake Forest, California, dan anak perusahaan dari perusahaan raksasa Italia Luxottica yang berbasis di Milan, mendesain, mengembangkan dan memproduksi peralatan pertunjukan olahraga dan barang-barang gaya hidup termasuk kacamata hitam, pelindung olahraga, kacamata ski / snowboard, jam tangan, pakaian, ransel, sepatu, bingkai optik, dan aksesori lainnya. Sebagian besar barang dirancang sendiri di kantor pusat mereka, tetapi beberapa negara memiliki desain eksklusif yang relevan dengan pasar mereka. Oakley saat ini memegang lebih dari 600 paten untuk kacamata, bahan, dan peralatan kinerja"
                    , "https://www.oakley.com/mam/celum/celum_assets/main_22-073_9-foundation-logo-sticker_black_001_72797_png_hero.jpg"
                    , "https://id.oakley.com/id"
                    , "https://www.brandfield.com/media/catalog/product/cache/image/9df78eab33525d08d6e5fb8d27136e95/8/8/888392276414.jpg"},
            {"Calvin Klein", "Calvin Klein Inc. adalah rumah mode Amerika Serikat yang didirikan oleh perancang busana Calvin Klein pada tahun 1968. Perusahaan ini berkantor pusat di Midtown Manhattan, New York City dan saat ini dimiliki oleh Phillips-Van Heusen\n" +
                    "Perusahaan ini terkenal dengan produk pakaian dalam, busana siap pakai, parfum, dan jam tangan."
                    , "https://s3-ap-southeast-1.amazonaws.com/asset1.gotomalls.com/uploads/retailers/logo/LADV__LOVLRRxAXw-L3NztdvWvnOGkHte-calvin-klein-1491796074_1.jpg"
                    , "https://www.calvinklein.us/en"
                    , "https://www.eyeboutique.com/Content/files/GenCart/ProductCatImages/CK_v_d650.jpg"},
            {"Guess", "Guess adalah merek dan pengecer pakaian Amerika. Selain pakaian untuk pria dan wanita, Guess memasarkan aksesoris mode lain seperti jam tangan, perhiasan, parfum, dan sepatu"
                    , "https://i0.wp.com/www.piazzolioutlet.com/wp-content/uploads/2018/05/Guess-Logo-Large-Black2.jpg?ssl=1"
                    , "https://shop.guess.com/en"
                    , "https://crescentheightsoptometry.com/wp-content/uploads/2016/12/guess_oversized2.jpg?quality=100.3019052014480"},
            {"Rayban", "Ray-Ban adalah merek kacamata hitam dan kacamata buatan Amerika yang dibuat pada tahun 1936 oleh perusahaan Amerika Bausch & Lomb. Merek ini dikenal karena kacamata hitam Wayfarer dan Aviator mereka. Pada 1999, Bausch & Lomb menjual merek itu ke konglomerat kacamata Italia, Luxottica Group, dengan harga US $ 640 juta."
                    , "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d1/Ray-Ban_logo.svg/1280px-Ray-Ban_logo.svg.png"
                    , "https://www.ray-ban.com/indonesia"
                    , "https://www.blibli.com/friends/assets/woman-sunglasses.jpg"},
            {"Emporio Armani", "Giorgio Armani SpA adalah rumah mode mewah Italia yang didirikan oleh Giorgio Armani yang mendesain, memproduksi, mendistribusikan dan menjual haute couture, siap pakai, barang kulit, sepatu, jam tangan, perhiasan, aksesoris, kacamata, kosmetik dan interior rumah."
                    , "http://logo-load.com/uploads/posts/2016-08/ea7-logo.png"
                    , "https://www.armani.com/us/armanicom/unisex/giorgio-armani/cross_section"
                    , "https://www.armani.com/cloud/armanif31wp/uploads/2019/03/GA_W_SUN_01.jpg"},
            {"Police", "Polisi adalah merek aksesoris mode Italia. Diluncurkan pada tahun 1983 oleh De Rigo bersaudara sebagai merek pertama perusahaan mereka Charme Lunettes, yang awalnya mengkhususkan diri dalam pembuatan kacamata hitam untuk pihak ketiga"
                    , "http://www.gudangjambandung.com/system/categories/images/000/000/025/original/12222.jpg?1552046691"
                    , "https://www.policelifestyle.com/en/eyewear-sunglasses.html"
                    , "https://static.fashionbeans.com/wp-content/uploads/2014/11/policeneym.jpg"},
            {"Dolce&Gabbana", "Dolce & Gabbana merupakan sebuah rumah mode bermarkas di Milan, Italia yang menghasilkan berbagai macam produk fashion"
                    , "http://sunglasshut.scene7.com/is/image/LuxotticaRetail/dolcegabbana_bl_18?$png-full$"
                    , "https://www.dolcegabbana.com/eyewear/"
                    , "https://i.pinimg.com/736x/43/14/9a/43149a83f74f0cb7350b8cad2afc746d.jpg"},
            {"QuickSilver", "Quiksilver (Boardriders, Inc.) adalah merek olahraga ritel Australia, yang didirikan di Torquay, Australia, tetapi sekarang berbasis di Huntington Beach, California. Ini adalah salah satu merek surfwear dan peralatan papan luncur lainnya terbesar di dunia. Perusahaan Quiksilver Inc. berganti nama menjadi Boardriders Inc. pada Maret 2017, menjadikannya pemilik Quiksilver, Roxy, dan DC Shoes. Pada tahun 2018, Boardriders mengakuisisi Billabong International Limited, memperoleh merek Billabong, Element, Von Zipper, RVCA dan XCEL.\n" +
                    "\n" +
                    "Logo merek, yang dirancang oleh pendiri Alan Green dan John Law pada tahun 1973, diilhami oleh pelukis kayu Jepang Hokusai, The Great Wave off Kanagawa. Ini menggambarkan gelombang besar dengan gunung di latar belakang merah.\n" +
                    "\n" +
                    "Merek ini juga memproduksi lini pakaian untuk wanita muda, di bawah merek Roxy. Logo Roxy terdiri dari dua salinan logo Quiksilver, satu tercermin, membentuk hati. Jajaran pakaian lain untuk wanita adalah di bawah merek Quiksilver Women.\n" +
                    "\n" +
                    "Pada 2013, Quiksilver memprakarsai rencana turnaround setelah menderita kerugian finansial selama enam tahun. Namun, pada September 2015, perusahaan mengajukan kebangkrutan. Setelah muncul dari kebangkrutan pada awal 2016, perusahaan sekali lagi menjadi pribadi dengan Oaktree Capital Management sebagai pemegang saham mayoritas."
                    , "https://static.quiksilver.com.au/skin/frontend/enterprise/global-rwd/images/logos/logo-quiksilver.png"
                    , "https://www.quiksilver.co.id/mens/accessories/sunglasses"
                    , "http://www.boardsportsource.com/wp-content/uploads/2016/09/Jeremy-Flores-wearing-the-Quiksilver-Chaser-Polarized-1.jpg"},
            {"Gucci", "Gucci pertama kali dimiliki oleh multimilyuner Jerilos. Pada tahun 1938 Gucci mengembangkan dan butik dibuka di Roma. Sesudah kematiannya pada 1953, Aldo menjadi peranan perusahaan sebagai pemimpin tertinggi, dibuka perusahaan butik di London, Paris, dan New York. Gucci bertepatan di Timur Jauh untuk selanjutnya melakukan perluasan pada pertengahan 1960-an, membuka pertokoan di Hong Kong dan Tokyo."
                    , "https://cdn.shopify.com/s/files/1/2374/3709/products/GUCCI_THUMB_237af47c-c672-444b-bd49-5bf9b5d4b99b_1080x.jpg?v=1514073359"
                    , "https://www.gucci.com/int/en/ca/men/mens-accessories/mens-eyewear-c-men-accessories-eyewear"
                    , "https://pmcwwd.files.wordpress.com/2017/01/gucci_ss17-eyewear_ni-ni_150dpi_8.jpg?crop=0px%2C13px%2C1299px%2C866px&resize=640%2C415"},
            {"Versace","Gianni Versace S.p.A. (diucapkan [ˈdʒɑnːi verˈsatʃe]), lebih dikenal dengan Versace, adalah perusahan pakaian Italia yang didirikan oleh Gianni Versace pada tahun 1978. Setelah Gianni Versace dibuhuh oleh Andrew Cunanan pada 15 Juli 1997, adik perempuannya, Donatella Versace, yang sebelumnya berperan sebagai wakil presiden, menjadi direktur kreatif perancangan busana Versace, dan kakaknya, Santo Versace, menjadi CEO.\n" +
                    "\n" +
                    "Butik pertama Versace dibuka pada tahun 1978 di Via della Spiga Milan pada 1978, dan menjadi populer. Kini, Versace menjadi salah satu rumah mode internasional terdepan. Versace merancang, memasarkan, dan mendistribusikan pakaian mewah, aksesori, wewangian, dan kosmetik melalui berbagai merek di bawah Grup Versace."
                    , "https://upload.wikimedia.org/wikipedia/id/b/b2/Versace.png"
                    , "https://www.versace.com/international/en/world-of-versace/brand/versace-eyewear/"
                    , "https://i.mdel.net/i/db/2019/5/1127870/1127870-800w.jpg"},
            {"Levi's", "Levi Strauss & Co. adalah produsen pakaian Amerika Serikat yang didirikan pada tahun 1853 oleh Levi Strauss. Perusahaan ini bersifat internasional dengan 3 divisi geografis: Levi Strauss North Americas, bermarkas di San Francisco Levi Strauss Europe, dengan markas di Kota Brusel "
                    , "https://upload.wikimedia.org/wikipedia/commons/thumb/7/75/Levi%27s_logo.svg/1200px-Levi%27s_logo.svg.png"
                    , "https://www.optiktunggal.com/product/brand/levis"
                    , "https://i.pinimg.com/originals/dd/31/82/dd31828457251f31bb4ed6065798f611.jpg"},
    };

    public static ArrayList<Glasses> getGlassesData() {
        ArrayList<Glasses> glassesList = new ArrayList<>();
        for (String[] gData : glassesData) {
            Glasses glasses = new Glasses();
            glasses.setNameGlasses(gData[0]);
            glasses.setInfoGlasses(gData[1]);
            glasses.setGlassesBadge(gData[2]);
            glasses.setShopGlasses(gData[3]);
            glasses.setPhotoGlasses(gData[4]);

            glassesList.add(glasses);
        }
        return glassesList;
    }
}
