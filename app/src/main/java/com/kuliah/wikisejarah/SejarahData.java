package com.kuliah.wikisejarah;

import java.util.ArrayList;

public class SejarahData {
    private static String[] sejarahNames = {
            "Perang Dunia I",
            "Perang Dunia II",
            "Perang Ambarawa"
    };

    private static String[] sejarahWiki = {
            "https://id.wikipedia.org/wiki/Perang_Dunia_I",
            "https://id.wikipedia.org/wiki/Perang_Dunia_II",
            "https://id.wikipedia.org/wiki/Palagan_Ambarawa"
    };

    private static String[] sejarahLatar = {
            "Pembunuhan tanggal 28 Juni 1914 terhadap Adipati Agung Franz Ferdinand dari Austria, pewaris takhta Austria-Hongaria, oleh seorang nasionalis Yugoslavia di Sarajevo, Bosnia dan Herzegovina adalah pencetus perang ini.",
            "Perang dunia II dimulai pada 1 September 1939, saat Jerman menyerang sisi barat Polandia. Saat itu Jerman dipimpin oleh Adolf Hitler. Serangan tersebut memicu pernyataan perang Inggris dan Perancis terhadap Jerman.",
            "Pertempuran Ambarawa diawali ketika Sekutu mendarat ke Semarang pada 20 Oktober 1945. Sekutu berada di bawah pimpinan Brigadir Jenderal Bethel. Kedatangan Sekutu diboncengi oleh NICA (Netherland Indies Civil Administration) atau Pemerintahan Sipil Hindia Belanda."
    };
    private static int[] sejarahLatarImages = {
            R.drawable.franz_ferdinand,
            R.drawable.ww2,
            R.drawable.ambarawa
    };


    private static String[] sejarahDetails = {
            "Perang Dunia I merupakan peperangan global yang terpusat di Eropa dan dimulai pada 28 Juli 1914 sampai dengan 11 November 1918. Perang ini sering juga disebut dengan Perang Besar karena berakhir sampai dengan dimulainya Perang Dunia II.\n" +
                    "\n" +
                    "Perang itu melibatkan semua kekuatan besar dunia, yang terbagi menjadi dua aliansi bertentangan, yaitu Blok Sekutu (berdasarkan Triple Entente, terdiri atas Britania Raya, Prancis, dan Kekaisaran Rusia) dan Blok Sentral (berdasarkan Triple Alliance, terdiri atas Jerman, Austro-Hongaria, dan Italia).",

            "Jenderal TNI Anumerta Ahmad Yani (juga dieja Achmad Yani; lahir di Purworejo, Jawa Tengah, 19 Juni 1922 – meninggal di Lubang Buaya, Jakarta, 1 Oktober 1965 pada umur 43 tahun) adalah komandan Tentara Nasional Indonesia Angkatan Darat, dan dibunuh oleh anggota Gerakan 30 September saat mencoba untuk menculik dia dari rumahnya.",
            "Sutomo (lahir di Surabaya, Jawa Timur, 3 Oktober 1920 – meninggal di Padang Arafah, Arab Saudi, 7 Oktober 1981 pada umur 61 tahun) lebih dikenal dengan sapaan akrab oleh rakyat sebagai Bung Tomo, adalah pahlawan yang terkenal karena peranannya dalam membangkitkan semangat rakyat untuk melawan kembalinya penjajah Belanda melalui tentara NICA, yang berakhir dengan pertempuran 10 November 1945 yang hingga kini diperingati sebagai Hari Pahlawan."
    };
    private static String[][] sejarahTokoh = {
            {
                "Vladimir Lenin",
                "Archduke Franz Ferdinand",
                "Winston Churchill",
                "John Joseph Pershing",
                "Wilhelm II"
            },
            {
                "Ahmad Yani"
            },
            {
                "Sutomo"
            }
    };
    private static int[][] sejarahTokohImages = {
            {
                R.drawable.vladimir_lenin,
                R.drawable.franz_ferdinand,
                R.drawable.winston_churchill,
                R.drawable.john_joseph_pershing,
                R.drawable.wilhelm_2
            },
            {
                R.drawable.ahmad_yani
            },
            {
                R.drawable.bung_tomo
            }
    };
    private static String[][] sejarahTokohDetail = {
            {
                    "Vladimir Ilyich Ulyanov atau lebih dikenal dengan julukan Lenin (22 April 1870 – 21 Januari 1924), ia adalah seorang tokoh revolusioner komunis, politikus, dan teoretikus politik yang berkebangsaan Rusia. Namanya dikenal dunia setelah ia mendirikan Partai Komunis Rusia.",
                    "Archduke Franz Ferdinand Carl Ludwig Joseph Maria dari Austria (18 Desember 1863 – 28 Juni 1914), ia adalah ahli waris dugaan tahta Austria-Hungaria. Pembunuhannya di Sarajevo dianggap sebagai penyebab paling langsung dari Perang Dunia I.",
                    "Sir Winston Leonard Spencer-Churchill (30 November 1874 – 24 Januari 1965), ia adalah seorang politisi, perwira militer dan penulis Britania Raya. Dia merupakan salah seorang perancang politik dan kemiliteran bagi pendaratan Gallipoli yang menemui kegagalan di Dardanelles ketika Perang Dunia I yang menyebabkan dia diberi julukan sebagai \"Penyembelih Gallipoli\"",
                    "John Joseph Pershing atau lebih dikenal dengan julukan Black Jack (13 September 1860 – 15 Juli 1948), ia adalah seorang jenderal ternama Angkatan Darat Amerika Serikat yang memimpin Pasukan Ekspedisi Amerika saat berperang melawan Jerman selama Perang Dunia I (1917 – 1918).",
                    "Friedrich Wilhelm Albert Victor von Hohenzollern atau dalam Kekaisaran Jerman Wilhelm II (27 Januari 1859 – 4 Juni 1941), ia adalah Kaisar Jerman dan Raja Prussia terakhir yang bertakhta pada tahun 15 Juni 1888 sampai 9 November 1918."
            },
            {
                "Jenderal TNI Ahmad Yani yang merupakan salah satu Pahlawan Revolusi yang gugur menjadi korban tragedi Gerakan 30 September dibunuh oleh anggota Gerakan 30 September saat mencoba untuk menculik dia dari rumahnya."
            },
            {
                "Sutomo atau lebih dikenal dengan sapaan akrab Bung Tomo adalah pahlawan nasional Indonesia yang terkenal karena peranannya dalam Pertempuran 10 November 1945."
            }
    };
    private static String[][] sejarahTimeline = {
            {
                "1879",
                "1882",
                "1887",
                "1888",
                "1890",
                "1893",
                "1891",
                "1902",
                "1904",
                "1905–1906",
                "1907",
                "1908",
                "1911",
                "1912–1913",
                "1914",
            },
            {
                "Ahmad Yani"
            },
            {
                    "Sutomo"
            }
    };
    private static String[][] sejarahTimelineDetail = {
            {
                    "Terbentuknya Dual Alliance (Aliansi Ganda) antara Jerman dan Austria",
                    "Terbentuknya Triple Alliance (Aliansi Tiga)",
                    "Reinsurance Treaty (Perjanjian Reasuransi)",
                    "Wilhelm II naik takhta Kekaisaran Jerman",
                    "Jerman menolak memperbarui Perjanjian Reasuransi",
                    "Aliansi Prancis–Kekaisaran Rusia",
                    "Splendid Isolation (Isolasi Ketat)",
                    "Anglo–Japanese Alliance (Aliansi Britania Raya–Jepang)",
                    "Entente Cordiale, Anglo–French Alliance (Aliansi Britania Raya–Prancis)",
                    "Krisis Maroko pertama",
                    "Anglo–Russian Convention (Entente Britania Raya–Kekaisaran Rusia)",
                    "Bosnia-Herzegovina dianeksasi secara resmi oleh Austro-Hongaria",
                    "Insiden Agadir di Maroko",
                    "Perang Balkan I dan II",
                    "Pembunuhan Pangeran Franz Ferdinand di Sarajevo",
            },
            {
                "Jenderal TNI Ahmad Yani yang merupakan salah satu Pahlawan Revolusi yang gugur menjadi korban tragedi Gerakan 30 September dibunuh oleh anggota Gerakan 30 September saat mencoba untuk menculik dia dari rumahnya."
            },
            {
                "Sutomo atau lebih dikenal dengan sapaan akrab Bung Tomo adalah pahlawan nasional Indonesia yang terkenal karena peranannya dalam Pertempuran 10 November 1945."
            }
    };

    private static int[] sejarahImages = {
            R.drawable.ww1,
            R.drawable.ww2,
            R.drawable.ambarawa
    };

    private static double[] sejarahLat = {
            60,
            60,
            -6.995016
    };
    private static double[] sejarahLng = {
            15,
            15,
            110.418427
    };

    static ArrayList<Sejarah> getListData() {
        ArrayList<Sejarah> list = new ArrayList<>();
        for (int position = 0; position < sejarahNames.length; position++) {
            Sejarah sejarah = new Sejarah();
            sejarah.setName(sejarahNames[position]);
            sejarah.setWiki(sejarahWiki[position]);
            sejarah.setDetail(sejarahDetails[position]);
            sejarah.setPhoto(sejarahImages[position]);
            sejarah.setTokoh(sejarahTokoh[position]);
            sejarah.setLatar(sejarahLatar[position]);
            sejarah.setPhotoLatar(sejarahLatarImages[position]);
            sejarah.setTokohDetail(sejarahTokohDetail[position]);
            sejarah.setTokohPhoto(sejarahTokohImages[position]);
            sejarah.setTimeline(sejarahTimeline[position]);
            sejarah.setTimelineDdetail(sejarahTimelineDetail[position]);
            sejarah.setLat(sejarahLat[position]);
            sejarah.setLng(sejarahLng[position]);
            list.add(sejarah);
        }
        return list;
    }
}