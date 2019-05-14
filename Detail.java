package com.example.application3;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

public class Detail extends AppCompatActivity {
 private EditText editText;
 private Button button;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent i1=getIntent();
        String name=(String)i1.getSerializableExtra("name");

        editText=(EditText) findViewById(R.id.editText);
        editText.setEnabled(false);


        button=findViewById(R.id.button);
        if(name.equals("Accordian"))
        {
            ImageView imageView;
            imageView=findViewById(R.id.imageview);
            imageView.setImageResource(R.drawable.accordian);
            editText.setText("Accordions are a family of box-shaped musical instruments of the bellows-driven free-reed aerophone type, colloquially referred to as a squeezebox. A person who plays the accordion is called an accordionist. The concertina and bandoneón are related; the harmonium and American reed organ are in the same family.The instrument is played by compressing or expanding the bellows while pressing buttons or keys, causing pallets to open, which allow air to flow across strips of brass or steel, called reeds. These vibrate to produce sound inside the body. Valves on opposing reeds of each note are used to make the instrument's reeds sound louder without air leaking from each reed block.[notes 1] The performer normally plays the melody on buttons or keys on the right-hand manual, and the accompaniment, consisting of bass and pre-set chord buttons, on the left-hand manual.The accordion is widely spread across the world. In some countries (for example Brazil,[2][3] Colombia, Dominican Republic, Mexico and Panama) it is used in popular music (for example Gaucho, Forró and Sertanejo in Brazil, Vallenato in Colombia, and norteño in Mexico), whereas in other regions (such as Europe, North America and other countries in South America) it tends to be more used for dance-pop and folk music and is often used in folk music in Europe, North America and South America. In Europe and North America, some popular music acts also make use of the instrument. Additionally, the accordion is used in cajun, zydeco, jazz music and in both solo and orchestral performances of classical music. The piano accordion is the official city instrument of San Francisco, California. Many conservatories in Europe have classical accordion departments. The oldest name for this group of instruments is harmonika, from the Greek harmonikos, meaning harmonic, musical. Today, native versions of the name accordion are more common. These names refer to the type of accordion patented by Cyrill Demian, which concerned automatically coupled chords on the bass side");
           editText.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   editText.setEnabled(true);
               }
           });

        }
        if(name.equals("Flute"))
        {
            ImageView imageView;
            imageView=findViewById(R.id.imageview);
            imageView.setImageResource(R.drawable.flute);
            editText.setText("The flute is a family of musical instruments in the woodwind group. Unlike woodwind instruments with reeds, a flute is an aerophone or reedless wind instrument that produces its sound from the flow of air across an opening. According to the instrument classification of Hornbostel–Sachs, flutes are categorized as edge-blown aerophones.[1][not in citation given] A musician who plays the flute can be referred to as a flute player, flautist, flutist or, less commonly, fluter or flutenist. ");
        }
        if(name.equals("Guitar"))
        {
            ImageView imageView;
            imageView=findViewById(R.id.imageview);
            imageView.setImageResource(R.drawable.guitar);
            editText.setText("The guitar is a fretted musical instrument that usually has six strings.[1] It is typically played with both hands by strumming or plucking the strings with either a guitar pick or the finger(s)/fingernails of one hand, while simultaneously fretting (pressing the strings against the frets) with the fingers of the other hand. The sound of the vibrating strings is projected either acoustically, by means of the hollow chamber of the guitar (for an acoustic guitar), or through an electrical amplifier and a speaker");
        }
        if(name.equals("Harp"))
        {
            ImageView imageView;
            imageView=findViewById(R.id.imageview);
            imageView.setImageResource(R.drawable.harp);
            editText.setText("The harp is a stringed musical instrument that has a number of individual strings running at an angle to its soundboard; the strings are plucked with the fingers. Harps have been known since antiquity in Asia, Africa and Europe, dating back at least as early as 3500 BC. The instrument had great popularity in Europe during the Middle Ages and Renaissance, where it evolved into a wide range of variants with new technologies, and was disseminated to Europe's colonies, finding particular popularity in Latin America. Although some ancient members of the harp family died out in the Near East and South Asia, descendants of early harps are still played in Myanmar and parts of Africa, and other defunct variants in Europe and Asia have been utilized by musicians in the modern era. ");
        }

        if(name.equals("Piano"))
        {
            ImageView imageView;
            imageView=findViewById(R.id.imageview);
            imageView.setImageResource(R.drawable.piano);
            editText.setText("The piano is an acoustic, stringed musical instrument invented in Italy by Bartolomeo Cristofori around the year 1700 (the exact year is uncertain), in which the strings are struck by hammers. It is played using a keyboard,[1] which is a row of keys (small levers) that the performer presses down or strikes with the fingers and thumbs of both hands to cause the hammers to strike the strings. ");
        }

        if(name.equals("Sitar"))
        {
            ImageView imageView;
            imageView=findViewById(R.id.imageview);
            imageView.setImageResource(R.drawable.sitar);
            editText.setText("The instrument flourished under the Mughals, and it is named after a Persian instrument called the setar (meaning three strings). The sitar flourished in the 16th and 17th centuries and arrived at its present form in 18th-century India. It derives its distinctive timbre and resonance from sympathetic strings, bridge design, a long hollow neck and a gourd-shaped resonance chamber. In appearance, the sitar is similar to the tanpura, except that it has frets. ");
        }

        if(name.equals("Viola"))
        {
            ImageView imageView;
            imageView=findViewById(R.id.imageview);
            imageView.setImageResource(R.drawable.voila);
            editText.setText("It is slightly larger than a violin and has a lower and deeper sound. Since the 18th century, it has been the middle or alto voice of the violin family, between the violin (which is tuned a perfect fifth above) and the cello (which is tuned an octave below).[2] The strings from low to high are typically tuned to C3, G3, D4, and A4. ");
        }

        if(name.equals("Violin"))
        {
            ImageView imageView;
            imageView=findViewById(R.id.imageview);
            imageView.setImageResource(R.drawable.violin);
            editText.setText("It is slightly larger than a violin and has a lower and deeper sound. Since the 18th century, it has been the middle or alto voice of the violin family, between the violin (which is tuned a perfect fifth above) and the cello (which is tuned an octave below).[2] The strings from low to high are typically tuned to C3, G3, D4, and A4. ");
        }

        if(name.equals("Harmonium"))
        {
            ImageView imageView;
            imageView=findViewById(R.id.imageview);
            imageView.setImageResource(R.drawable.harmonium);
            editText.setText("The violin, sometimes known as a fiddle, is a wooden string instrument in the violin family. Most violins have a hollow wooden body. It is the smallest and highest-pitched instrument in the family in regular use. Smaller violin-type instruments exist, including the violino piccolo and the kit violin, but these are virtually unused.");
        }

        if(name.equals("Jaltarang"))
        {
            ImageView imageView;
            imageView=findViewById(R.id.imageview);
            imageView.setImageResource(R.drawable.jaltarang);
            editText.setText("The Jal Tarang is a melodic percussion instrument which originates from the Indian sub-continent. It consists of a set of ceramic or metal bowls filled with water. The bowls are played by striking the edge with beaters, one in each hand. ");
        }

        if(name.equals("Veena"))
        {
            ImageView imageView;
            imageView=findViewById(R.id.imageview);
            imageView.setImageResource(R.drawable.veena);
            editText.setText("The South Indian veena design, used in classical Carnatic music, is a lute. It is a long-necked, pear-shaped lute, but instead of the lower gourd of the north Indian design it has a pear shaped wooden piece. ");
        }

        if(name.equals("Tanpura"))
        {
            ImageView imageView;
            imageView=findViewById(R.id.imageview);
            imageView.setImageResource(R.drawable.tanpura);
            editText.setText("A tanpura is not played in rhythm with the soloist or percussionist: as the precise timing of plucking a cycle of four strings in a continuous loop is a determinant factor in the resultant sound, it is played unchangingly during the complete performance. ");
        }

        if(name.equals("RudraVeena"))
        {
            ImageView imageView;
            imageView=findViewById(R.id.imageview);
            imageView.setImageResource(R.drawable.rudraveena);
            editText.setText("Rudra veena (also spelled Rudra vina, and also called Bīn in North India), is a large plucked string instrument, originating from the Indian subcontinent, used in Hindustani classical music, one of the major types of veena played in Indian classical music. ");
        }
        if(name.equals("SaraswatiVeena"))
        {
            ImageView imageView;
            imageView=findViewById(R.id.imageview);
            imageView.setImageResource(R.drawable.saraswativeena);
            editText.setText(" It is named after the Hindu goddess Saraswati, who is usually depicted holding or playing the instrument. Also known as raghunatha veena is used mostly in Carnatic Indian classical music. There are several variations of the veena, which in its South Indian form is a member of the lute family. ");
        }

        if(name.equals("SagarVeena"))
        {
            ImageView imageView;
            imageView=findViewById(R.id.imageview);
            imageView.setImageResource(R.drawable.sagar);
            editText.setText("The Sagar veena is a plucked string instrument used in Pakistani music. Similar to the Carnatic Gottuvadhyam (Chitra Vina) and Vichitra veena, it has no frets and is played with a slide. Developed in 1970 by prominent Pakistani lawyer Raza Kazim, it has evolved from Vichitra veena in both structure and sound");
        }
button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
      EditText  editText=(EditText) findViewById(R.id.editText);

        editText.setEnabled(true);

    }
});

    }
}
