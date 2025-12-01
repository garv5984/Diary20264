
# Flipbook Diary (Android)

Starter project skeleton generated for a year-configurable diary with flip animation, typing, stylus handwriting, HTR, Room storage, export, security, and accessibility.

## How to open
1. Open `FlipbookDiary` in Android Studio (Giraffe or newer).
2. Let Gradle sync; adjust dependency versions if needed.
3. Run on a device or emulator (min SDK 24).

## Next steps
- Implement `FlipbookPage` curl rendering (Canvas/GL).
- Flesh out `HandwritingCanvas` to capture strokes with pressure/tilt.
- Integrate ML Kit Digital Ink in `ml/HandwritingRecognizer.kt`.
- Build rich text editor and search.
- Add biometric lock and encryption.
- Implement PDF export and backup.
- Add accessibility options and Reduce Motion.

## Modules
- ui: Compose screens (reader, calendar, editor, settings)
- graphics: curl engine and handwriting canvas
- data: Room DB and repositories
- ml: handwriting recognition
- export: PDF and backup
- security: biometric & crypto

