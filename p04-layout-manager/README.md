| Bagian | Panel | Layout |
|:------:|:-----:|:------:|
| Jendela | Jframe | BorderLayout |
| Header | JPanel | BoxLayout |
| Isi Form | JPanel | GridBagLayout |
| Tombol | JPanel | FlowLayout |

# Peta Event
| Komponen | Menu Events | Aksi |
|:---------|:------------|:-----|
| Kotak centang setuju | Item: itemStateChanged | Tombol Daftar hanya aktif jika dicentang |
| Tombol Batal | Action: actionPerformed | Kosongkan semua isian dan kembalikan fokus ke NPM |
| Tombol Daftar | Action: actionPerformed | Tampilkan ringkasan data dengan JOptionPane |
| Isian NPM | Key: keyReleased | Label kecil menampilkan jumlah digit, misalnya "8 dari 10 digit" |
| Form (JFrame di Navigator) | Window: windowClosing | Minta konfirmasi sebelum aplikasi ditutup |