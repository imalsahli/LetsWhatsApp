# 📱 LetsWhatsApp

A simple and clean Android app that lets you open a WhatsApp chat with **any phone number**, without needing to save it to your contacts first. It also keeps a history of all previously used numbers for quick access.

---

## ✨ Features

- 💬 **Open WhatsApp instantly** with any phone number
- 📋 **Phone number history** — view all previously entered numbers
- ✅ Input validation — shows a warning if the field is empty
- 🔒 Data stored locally using `SharedPreferences`

---

## 🚀 Getting Started

### Prerequisites

- Android Studio (latest recommended)
- Android SDK (minSdk 21+)
- A physical device or emulator

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/imalsahli/LetsWhatsApp.git
   ```

2. **Open in Android Studio**
   - Go to `File > Open` and select the project folder

3. **Build & Run**
   - Connect your Android device or start an emulator
   - Click the ▶️ Run button

---

## 🛠️ How It Works

1. Enter a phone number (with country code, e.g. `+1234567890`)
2. Tap **"Let's Chatting"**
3. The app opens WhatsApp directly with that number using the deep link:
   ```
   https://wa.me/<phone_number>
   ```
4. The number is automatically saved to your local history
5. Tap **"View History"** to see all previously used numbers

---

## 🧰 Built With

- **Java** — Core language
- **Android SDK** — Platform framework
- **AndroidX AppCompat** — Backward compatibility
- **SharedPreferences** — Local data storage
- **WhatsApp URL Scheme** — `https://wa.me/` deep link

---

## 🤝 Contributing

Contributions are welcome! Feel free to open an issue or submit a pull request.


## 📄 License

This project is open source and available under the [MIT License](LICENSE).

---

## 👤 Author

**Your Name**
- GitHub: [@imalsahli](https://github.com/imalsahli)

---

> ⭐ If you found this project useful, please consider giving it a star!
