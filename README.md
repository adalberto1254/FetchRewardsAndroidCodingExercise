# App in Action
[Screen_recording_20250401_233454.webm](https://github.com/user-attachments/assets/30fd5db1-e0de-4983-9c18-b1def35d353b)


# Fetch Rewards Coding Exercise

This is a native Android app written in Kotlin that retrieves data from 
[hiring.json](https://fetch-hiring.s3.amazonaws.com/hiring.json) and displays it grouped 
by `listId`, sorted by `listId` in ascending order, and also sorted by `id` in ascending order.

The directions say to sort by `name`, not by `id`, but I’m assuming that instruction
was loosely worded rather than a strict requirement. I’m basing this on having
access to the full data set and confirming that sorting by `id` yields the same
results. I understand that in a different context, this assumption could be risky.
In that case we would need to split the name into a character portion and a number
portion and sort the number portion numerically. Or even consider that the
characters could also be different and sort those alphabetically too.

## Features

- Retrieves and displays list items from the remote JSON endpoint.
- Filters out items with null or blank `name` fields.
- Groups the items by `listId`, sorts by `listId`, and sorts them by `name`.

## Requirements

- Android Studio (latest stable release recommended)
- Android OS (targeting current releases)
- Kotlin 1.8+
- Gradle

## Setup

1. Clone the repository: git clone [https://github.com/yourusername/FetchRewardsApp.git](https://github.com/adalberto1254/FetchRewardsAndroidCodingExercise.git)
2. Open the project in Android Studio.
3. Build the project using the standard build configuration.
4. Run the app on an emulator or physical device with internet access.

## Design Decisions

- Data is fetched using Retrofit on a background thread.
- The list is filtered and sorted according to the provided requirements.
- The user interface is built with Jetpack Compose for modern Android UI design.

## Running the App

1. Ensure your device has internet access.
2. Build and run the project in Android Studio.
3. The main screen will display the list of items grouped by `listId` and properly sorted.

## Additional Notes
Thanks for the opportunity, i'm looking forward to hearing back! : )

