<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">


    <TextView
        android:id="@+id/gender_label"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentStart="true"
        android:layout_alignParentTop="true"
        android:layout_marginStart="16dp"
        android:layout_marginTop="20dp"
        android:layout_marginEnd="16dp"
        android:layout_marginBottom="16dp"
        android:text="Select Gender:" />

    <RadioGroup
        android:id="@+id/gender_radio_group"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:layout_toEndOf="@id/gender_label"
        android:layout_margin="16dp">

        <RadioButton
            android:id="@+id/male_radio_button"
            android:layout_width="76dp"
            android:layout_height="match_parent"
            android:text="Grtest" />

        <RadioButton
            android:id="@+id/female_radio_button"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Smlst" />

    </RadioGroup>

</RelativeLayout>