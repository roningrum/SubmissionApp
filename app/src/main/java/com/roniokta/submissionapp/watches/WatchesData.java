package com.roniokta.submissionapp.watches;

import java.util.ArrayList;

public class WatchesData {
    private static String[][] watchData = new String[][]{
            {"Rolex", "Rolex SA adalah produsen pembuat jam tangan mewah asal Swiss. Konsep Rolex adalah mewah seperti menggunakan material emas, perak, kristal dalam jam tangannya, mirip dengan konsep mewah seperti Vertu dalam telepon genggam. Walaupun demikian, Rolex dapat disebut sebagai entry-level untuk jam tangan luxury."
                    , "https://upload.wikimedia.org/wikipedia/id/thumb/9/95/Rolex_logo.svg/220px-Rolex_logo.svg.png"
                    , "https://www.rolex.com/id"
                    , "https://images.rolex.com/2019/catalogue/images/upright-bba-with-shadow/m116610lv-0002.png?impolicy=upright-grid-card&imwidth=585"},
            {"Casio", "Casio Computer Co., Ltd. (カシオ計算機株式会社 Kashio Keisanki Kabushiki-gaisha) merupakan sebuah perusahaan multinasional yang menghasilkan berbagai macam produk elektronik. Perusahaan ini didirikan pada tahun 1946, dan pada tahun 1957 dirilis Kalkulator pertama didunia. Perusahaan ini bermarkas di Shibuya, Tokyo, Jepang. Perusahaan ini umumnya mempekerjakan 11.336 pegawai pada tahun 2010. Casio menghasilkan berbagai produk elektronik seperti Kalkulator, Kamera Digital, Alat Musik, Jam Tangan dan lainnya."
                    , "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4d/Casio_logo.svg/240px-Casio_logo.svg.png"
                    , "https://www.casio-intl.com/id/id/"
                    , "https://images-na.ssl-images-amazon.com/images/I/81at5Tr9KmL._UL1500_.jpg"},
            {"Seiko", "Seiko Holdings Corporation (セイコーホールディングス株式会社 Seikō Hōrudingusu Kabushiki-gaisha) (TYO: 8050) , atau lebih dikenal dengan Seiko adalah perusahaan Jepang yang menghasilkan jam tangan. Didirikan pada tahun 1881 dengan nama \"K. Hattori\" (服部時計店 Hattori Tokeiten) di kawasan Ginza, Tokyo. P"
                    , "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Seiko_logo.svg/500px-Seiko_logo.svg.png"
                    , "https://www.seikowatches.com/global-en"
                    , "https://www.brandfield.com/media/catalog/product/cache/image/9df78eab33525d08d6e5fb8d27136e95/4/9/4954628225559.jpg"},
            {"Tag Heuer", "TAG Heuer S.A. merupakan sebuah perusahaan multinasional yang menghasilkan berbagai macam produk elektronik. Perusahaan ini didirikan pada tahun 1860. Bermarkas di Neuchâtel, Swiss. Perusahaan ini umumnya mempekerjakan 1.000 pegawai.\n" +
                    "\n" +
                    "Perusahaan ini umumnya menghasilkan produk utamanya seperti jam tangan."
                    , "https://upload.wikimedia.org/wikipedia/commons/thumb/5/57/TAG_HEUER_logo.svg/250px-TAG_HEUER_logo.svg.png"
                    , "https://www.tagheuer.com/en"
                    , "https://www.francisandgaye.co.uk/images/tag-heuer-mens-carrera-heuer-01-aston-martin-limited-edition-watch-p22658-31770_image.jpg"},
            {"Daniel Wellington", "Daniel Wellington adalah merek Swedia yang didirikan pada 2011 oleh Filip Tysander. Dengan menggunakan desain minimalis, DW menciptakan jam tangan yang dapat dijual kepada konsumen generasi muda"
                    , "https://stdavidscardiff.com/sites/st_davids/files/styles/shop_logo/public/images/shops/logos/sd_shoplogo_danielwellington_630x560.jpg?itok=m9EIerAh"
                    , "https://www.danielwellington.com/id/"
                    , "https://ecs7.tokopedia.net/img/cache/700/product-1/2018/5/11/1652232/1652232_ada09fde-18ed-4246-b446-70da517ca596.jpg"},
            {"Alba", "Alba adalah sub-merek dari Seiko Watch Corporation yang memproduksi garis jam tangan. Ini pertama kali muncul pada tahun 1979. Menggunakan gerakan keluarga Seiko sendiri tetapi dengan gaya modern yang dirancang untuk menarik pelanggan yang lebih muda, jam tangan Alba terutama ditujukan untuk pasar Asia dengan harapan menciptakan loyalitas jangka panjang kepada kelompok Seiko sebagai daya beli pelanggan ini. meningkat."
                    , "https://www.tunjunganplaza.com/userfiles/file/tp/mall/large/5790a4097b5e8.jpg"
                    , "http://www.alba-watch.com/"
                    , "http://www.alba-watch.com/media/watchtype/1b.jpg"},
            {"Fossil", "Fossil Group, Inc. adalah perancang dan pabrikan mode Amerika yang didirikan pada 1984 oleh Tom Kartsotis dan berpusat di Richardson, Texas. Merek-merek mereka termasuk Fossil, Relic, Abacus, Michele Watch, Skagen Denmark, Misfit, WSI, dan Zodiac Watches"
                    , "https://cdn.dnaindia.com/sites/default/files/styles/full/public/2016/10/05/507590-photo.jpg"
                    , "https://www.fossil.com/us/en.html"
                    , "https://www.brandfield.com/media/catalog/product/cache/image/9df78eab33525d08d6e5fb8d27136e95/4/0/4053858602526.jpg"},
            {"Tissot", "Tissot didirikan pada tahun 1853 oleh Charles-Félicien Tissot dan putranya Charles-Émile Tissot di kota Swiss Le Locle, di wilayah Neuchâtel di Pegunungan Jura.\n" +
                    "\n" +
                    "Tissot memperkenalkan jam saku produksi massal pertama serta jam saku pertama dengan dua zona waktu pada tahun 1853 dan jam anti-magnetik pertama, pada tahun 1929–30. Charles-Emile Tissot berangkat ke Rusia pada 1858 dan berhasil menjual jam saku saku mereka di Kekaisaran Rusia. Perusahaan Tissot juga yang pertama kali membuat jam tangan dari plastik (Idea 2001 pada tahun 1971), batu (Alpine granite RockWatch pada tahun 1985), ibu dari mutiara (jam tangan Pearl pada tahun 1987), dan kayu (jam tangan Wood pada tahun 1988). Tissot bergabung dengan Omega pada tahun 1930 dan jam tangan Tissot-Omega dari era ini banyak dicari oleh para kolektor."
                    , "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ce/Tissot_Logo.svg/200px-Tissot_Logo.svg.png"
                    , "https://www.tissotwatches.com/en-sg/homepage"
                    , "https://www.brandfield.com/media/catalog/product/cache/image/9df78eab33525d08d6e5fb8d27136e95/7/6/7611608283134.jpg"},
            {"Mont Blanc", "Montblanc International adalah produsen alat tulis, jam tangan, perhiasan, kacamata dan barang-barang kulit mewah dari Jerman, yang sering diidentifikasi dengan logo \"Puncak Salju\""
                    , "https://s3-ap-southeast-1.amazonaws.com/asset1.gotomalls.com/uploads/retailers/logo/L7aPlOvWvlcl_aOW-1622-montblanc-1477541447_1.png"
                    , "https://www.montblanc.com/en/collection/watches.html"
                    , "https://cache.mrporter.com/variants/images/3983529959371671/ou/w2000_q80.jpg"},
            {"Omega", "Omega SA merupakan sebuah perusahaan yang berbasis di Biel/Bienne, Swiss. Omega saat ini dimiliki oleh Swatch Group. Omega terkenal sebagai salah satu perusahaan pembuat jam tangan mewah di dunia. Bintang-bintang yang sempat menjadi bintang iklan Omega antara lain Pierce Brosnan, Daniel Craig, dan Michael Schumacher."
                    , "https://cdn.mall.sayidaty.net/image/cache/Shops/a/a/e/b/4/aaeb4e3ba47c38c10442ced901d5249e-420x420.png"
                    , "https://www.omegawatches.com/"
                    , "https://i.ytimg.com/vi/kM-enA_G8ec/maxresdefault.jpg"},
    };

    public static ArrayList<Watches> getWatchesData() {
        ArrayList<Watches> listWatch = new ArrayList<>();
        for (String[] wData : watchData) {
            Watches watches = new Watches();
            watches.setNameWatch(wData[0]);
            watches.setInfoWatch(wData[1]);
            watches.setWatchBadge(wData[2]);
            watches.setShopWatch(wData[3]);
            watches.setPhotoWatch(wData[4]);

            listWatch.add(watches);
        }
        return listWatch;
    }
}
