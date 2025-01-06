

# Business Card App (Compose Quadrant)

This Android application demonstrates the usage of Jetpack Compose to create a visually appealing business card layout. The app displays a user's profile, including a photo, name, profession, and contact details (phone, social media, and email).

## Features:
- Light green background
- Circular logo with a border
- User’s name and profession displayed prominently
- Contact details section with icons and text
- Use of Jetpack Compose for UI development

## Screenshots:

![Business Card Screenshot](images/screenshot.png) *(Add your actual screenshot here)*

## Prerequisites:
Before running this project, ensure that you have the following installed:
- Android Studio (with support for Kotlin and Jetpack Compose)
- An Android Emulator or a physical Android device

## How to Run:

1. **Clone the repository:**
   ```bash
   git clone https://github.com/yourusername/compose-quadrant.git
   ```

2. **Open the project in Android Studio.**

3. **Sync the project with Gradle files.**

4. **Run the app:**
   - Choose an emulator or a physical device.
   - Click the `Run` button (green triangle).

5. The app will launch showing a business card layout.

## Code Explanation:

### `MainActivity`
The `MainActivity` class contains the entry point of the app, where the `BusinessCardCentered()` composable is called inside the `setContent` block. It applies a theme and provides a background container using `Surface`.

### `BusinessCardCentered`
This composable arranges the business card elements:
- **Profile image**: An image of the user (replace `R.drawable.android_logo` with your own logo).
- **Name and profession**: User's name and profession in styled `Text`.
- **Contact info**: Phone, social media handle, and email displayed with icons.

### `ContactInfoRow`
This composable takes an `icon` and `text` as input and displays the contact details in a row. It aligns the icon and text horizontally and applies padding to create spacing.

### Modifiers:
- `fillMaxSize()`: Ensures that the layout fills the entire screen.
- `background()`: Sets the background color for various elements.
- `padding()`: Adds space around elements.
- `border()`: Adds a border around the profile image.

## Customizations:
You can easily change the content, colors, and layout:
- **Replace the logo**: Use your own logo by replacing `R.drawable.android_logo`.
- **Modify text**: Edit the `text` fields to display your details.
- **Change colors**: Customize the colors in the `background()`, `textStyle()`, and other UI elements.

## Contributing:
1. Fork this repository.
2. Create a new branch for your feature or bug fix.
3. Make your changes and commit them.
4. Push your changes to your fork.
5. Open a pull request to contribute your changes.

## License:
This project is open-source and available under the [MIT License](LICENSE).

---


