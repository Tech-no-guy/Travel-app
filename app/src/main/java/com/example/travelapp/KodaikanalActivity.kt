package com.example.travelapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.travelapp.ui.theme.TravelAppTheme

class KodaikanalActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TravelAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    KodaikanalContent()
                }
            }
        }
    }
}

@Composable
fun KodaikanalContent() {
    Column(
        modifier = Modifier
            .background(color = Color.White)
            .padding(20.dp)
            .verticalScroll(rememberScrollState())
    ) {
        // Title
        Text(
            fontSize = 40.sp,
            color = Color(android.graphics.Color.rgb(59, 89, 152)),
            fontFamily = FontFamily.Cursive,
            text = stringResource(id = R.string.kodaikanal_title)  // Ensure the string resource is defined in strings.xml
        )

        // Image of Kodaikanal
        Image(
            painter = painterResource(id = R.drawable.kodaikanal),  // Replace with actual image resource
            contentDescription = "Kodaikanal",
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(200.dp)
        )

        // Itinerary Text
        Text(
            color = Color.Black,
            fontSize = 16.sp,
            text = "Day 1: Arrival and Coaker's Walk\n" +
                    "Explore Coaker's Walk for stunning views of the valleys.\n\n" +

                    "Day 2: Kodaikanal Lake and Bryant Park\n" +
                    "Visit Kodaikanal Lake and take a relaxing boat ride, then head to Bryant Park for a beautiful botanical experience.\n\n" +

                    "Day 3: Pine Forest and Guna Caves\n" +
                    "Experience the dense Pine Forest and Guna Caves for adventure and scenery.\n\n" +

                    "Day 4: Departure\n" +
                    "Enjoy a peaceful morning before departing Kodaikanal."
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewKodaikanalContent() {
    TravelAppTheme {
        KodaikanalContent()
    }
}
