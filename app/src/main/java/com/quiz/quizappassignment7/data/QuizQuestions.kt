package com.quiz.quizappassignment7.data

import com.quiz.quizappassignment7.constants.Constant.IS_CHECK_BOX
import com.quiz.quizappassignment7.constants.Constant.IS_RADIO_BUTTON

class QuizQuestions {

    companion object {
        fun getQuizQuestions(): MutableList<Quiz> {
            return mutableListOf(
                Quiz(
                    1,
                    "1. Which of the following is the topmost layer of android architecture?",
                    IS_RADIO_BUTTON,
                    "On the top of the application framework, there are applications. All applications such as home, contact, settings, games, browsers are using an android framework that uses android runtime and libraries.",
                    "c",
                    "Applications",
                    "",
                    "",
                    mutableListOf("System Libraries and Android Runtime",
                            "Linux Kernel",
                            "Applications",
                            "Applications Framework")
                ),
                Quiz(
                    2,
                    "2. What is contained in manifest.xml?",
                    IS_RADIO_BUTTON,
                    "The AndroidManifest.xml file contains information of your package, including components of the application such as activities, services, broadcast receivers, content providers, etc. It is responsible for protecting the application to access any protected parts by providing the permissions.",
                    "c",
                    "Permission that the application requires",
                    "",
                    "",
                    mutableListOf("Source code",
                            "List of strings used in the app",
                            "Permission that the application requires",
                            "None of the above")
                ),
                Quiz(
                    3,
                    "3. Which of the following is not a nickname of any android version?",
                    IS_RADIO_BUTTON,
                    "Muffin is not a nickname of any android version.",
                    "b",
                    "Muffin",
                    "",
                    "",
                    mutableListOf("Donut",
                            "Muffin",
                            "Honeycomb",
                            "Cupcake")
                ),
                Quiz(
                    4,
                    "4. What is the nine-patch images tool in android?",
                    IS_RADIO_BUTTON,
                    "The nine-patch images tool in android is used to change the bitmap images into nine sections with four corners, four edges, and an axis.",
                    "b",
                    "It is used to change the bitmap images into nine sections",
                    "",
                    "",
                    mutableListOf("It is an image extension tool.",
                        "It is used to change the bitmap images into nine sections",
                        "Both (a) and (b)",
                        "None of the above")
                ),
                Quiz(
                    5,
                    "5. Which of the following is a dialog class in android?",
                    IS_RADIO_BUTTON,
                    "Dialog classes supported in android are Alert, Progress, Date Picker, and Time Picker Dialogs",
                    "d",
                    "All of the above",
                    "",
                    "",
                    mutableListOf("AlertDialog",
                            "DatePicker Dialog",
                            "ProgressDialog",
                            "All of the above")
                ),
                Quiz(
                    6,
                    "6.  In which state the activity is, if it is not in focus, but still visible on the screen?",
                    IS_RADIO_BUTTON,
                    "When an activity is not in focus that is not interacting with the user but still visible on the screen, then the activity is in paused state.",
                    "c",
                    "Paused State",
                    "",
                    "",
                    mutableListOf("Stopped state",
                            "Destroyed state",
                            "Paused state",
                            "Running state")
                ),
                Quiz(
                    7,
                    "7. Which of the following is the built-in database of Android?",
                    IS_RADIO_BUTTON,
                    "SQLite is an open-source relational database, i.e., used to perform database operations on android devices such as storing, manipulating, or retrieving persistent data from the database. It is embedded in android by default. So, there is no need to perform any database setup or administration task.",
                    "a",
                    "SQLite",
                    "",
                    "",
                    mutableListOf("SQLite",
                            "MySQL",
                            "Oracle",
                            "All of the above")
                ),
                Quiz(
                    8,
                    "8. Which of the following features are updated in Android 4.1(Jelly Bean)?",
                    IS_RADIO_BUTTON,
                    "Android 4.1(Jelly Bean) updates to following features: smoother user interface, enhance accessibility, expandable notification, fixed bug on Nexus 7, one-finger gestures to expand/collapse notifications, lock screen improvement, multiple user accounts (tablets only), new clock application, Bluetooth low energy support, volume for incoming call, 4K resolution support, native emoji support, bug fixes for the Nexus 7 LTE.",
                    "d",
                    "All of the above",
                    "",
                    "",
                    mutableListOf("User Interface",
                            "Lock screen improvement",
                            "New clock application",
                            "All of the above")
                ),
                Quiz(
                    9,
                    "9. Which of the following android library provides access to the database?",
                    IS_RADIO_BUTTON,
                    "No Explanation Provided",
                    "b",
                    "android.database",
                    "",
                    "",
                    mutableListOf("android.content",
                            "android.database",
                            "android.api",
                            "None of the above")
                ),
                Quiz(
                    10,
                    "10. In Android studio, which of the following callback is called when an activity starts interacting with the user?",
                    IS_RADIO_BUTTON,
                    "onResume is called when an activity will start interacting with the user.",
                    "c",
                    "onResume",
                    "",
                    "",
                    mutableListOf("onDestroy",
                            "onCreate",
                            "onResume",
                            "onStop")
                ),
                Quiz(
                    11,
                    "11. The sendStickybroadcast(intent) method in android is used to show that the intent is -",
                    IS_RADIO_BUTTON,
                    "If we use the sendStickyBroadcast(Intent) method, the Intent is sticky. It means that the Intent that we are sending will stay around after the completion of the broadcast.",
                    "c",
                    "Sticky",
                    "",
                    "",
                    mutableListOf("Optional",
                            "Prioritize",
                            "Sticky",
                            "None of the above")
                ),
                Quiz(
                    12,
                    "12. Which of the following method is used by services to clean up any services?",
                    IS_RADIO_BUTTON,
                    "The onDestroy() method can be used by services to clean up any resources like receivers, threads, registered listeners, etc.",
                    "c",
                    "onDestroy() method",
                    "",
                    "",
                    mutableListOf("onStop() method",
                            "stopService() method",
                            "onDestroy() method",
                            "stopSelf() method")
                ),
                Quiz(
                    13,
                    "13. ANR in android stands for -",
                    IS_RADIO_BUTTON,
                    "ANR stands for Application Not Responding. It is a dialog box that appears if the application is no longer responding.",
                    "b",
                    "Application Not Responding",
                    "",
                    "",
                    mutableListOf("Application Not Reacting",
                            "Application Not Responding",
                            "Application Not Rendering",
                            "None of the above")
                ),
                Quiz(
                    14,
                    "14. All layout classes are the subclasses of -",
                    IS_RADIO_BUTTON,
                    " In Android, all layout classes are the subclasses of android.view.ViewGroup.",
                    "b",
                    "android.view.ViewGroup",
                    "",
                    "",
                    mutableListOf("android.view.View",
                            "android.view.ViewGroup",
                            "android.widget",
                            "None of the above")
                ),
                Quiz(
                    15,
                    "15. GCM in android stands for -",
                    IS_RADIO_BUTTON,
                    "GCM stands for Google Cloud Messaging. It is provided by Google for sending push notifications to and from an Android application.",
                    "a",
                    "Google Cloud Messaging",
                    "",
                    "",
                    mutableListOf("Google Cloud Messaging",
                            "Google Count Messaging",
                            "Google Center Messaging",
                            "None of the above")
                )
            )
        }
    }
}