package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.benchmark.perfetto.Row
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Set the theme for your app
            ComposeQuadrantTheme {
                // Use a surface container to apply background color and styling
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Entry point to the UI
                    BusinessCardCentered() // This is your entry composable
                }
            }
        }
    }
}
@Composable
fun BusinessCardCentered() {
    val imageModifier = Modifier
        .size(150.dp)
        .border(BorderStroke(1.dp, Color.Black))
        .background(Color.Black)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFDFF3E3)) // Light green background
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween, // Ensures spacing between elements
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Empty space at the top
        Spacer(modifier = Modifier.weight(1f))

        // Center section with logo and name
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.android_logo), // Replace with your drawable
                contentDescription = "Android Logo",
                modifier = imageModifier
                    .size(100.dp)
                    .padding(bottom = 16.dp)
            )

            Text(
                text = "Suyog Shejal",
                style = TextStyle(
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
            )

            Text(
                text = "Android Developer Extraordinaire",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFF388E3C)
                ),
                modifier = Modifier.padding(top = 8.dp)
            )
        }

        // Empty space to push contact details to the bottom
        Spacer(modifier = Modifier.weight(1f))

        // Bottom section with contact details
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ContactInfoRow(
                icon = Icons.Default.Phone,
                text = "+91 9325285808 "
            )
            ContactInfoRow(
                icon = Icons.Default.Share,
                text = "@AndroidDev"
            )
            ContactInfoRow(
                icon = Icons.Default.Email,
                text = "Suyogshejal200@gmail.com"
            )
        }
    }
}

@Composable
fun ContactInfoRow(icon: ImageVector, text: String) {


    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 68.dp)
            .padding(vertical = 8.dp),
    )
        {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color(0xFF388E3C),
            modifier = Modifier.size(24.dp)
        )

        Spacer(modifier = Modifier.width(16.dp))
        Text(
            text = text,
            style = TextStyle(
                fontSize = 16.sp,
                color = Color.Black
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBusinessCardCentered() {
    BusinessCardCentered()
}
