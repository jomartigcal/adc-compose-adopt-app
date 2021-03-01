/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.data

import androidx.annotation.DrawableRes
import com.example.androiddevchallenge.R

data class Animal(
    val id: Int,
    val name: String,
    @DrawableRes val image: Int,
    val breed: String,
    val gender: String,
    val description: String,
)

fun getAnimals() = listOf(
    Animal(
        158378, "Roni", R.drawable.ic_dog_roni, "Akita Inu", "Female",
        "Meet our lovely girl Roni! Roni does have some fear based issues and likely experienced abuse in her life, but once you are in her bubble of trust then it doesn’t get any sweeter! Roni will require a quiet, calm adult only home that is able to come out for multiple positive meets with her before she goes to her new home, but she is totally worth a little bit of extra time and energy. Once she chooses you, this good girl will love to be by your side and be your favourite adventure buddy. Roni has shown us she loves to swim, go for car rides, share your pizza (in moderation of course!) and play endless amounts fetch with you! We are looking for an adopter that can continue to work on Roni’s stranger danger with positive reinforcement training and redirection using her favourite treats. Roni does require a home where she is the only pet, as she does have some prey drive and just like her people she chooses her dogs too. She seems to be excited by some dogs and will react to others, so she is not a great candidate for dog parks. Please submit your application to the Maple Ridge branch of the BC SPCA in order to be reviewed."
    ),
    Animal(
        162634, "Karli", R.drawable.ic_dog_karli, "Rottweiler", "Female",
        "Miss Karli is happily awaiting her fur-ever home! This girl is full of beans, she has a lot of personality and a lot of energy to burn. Karli can be quite nervous of new people, but if you respect her space and have some treats near by, she will quickly warm up to you. Karli is showing us that she can learn super fast through positive reinforcement training and is hoping her new family can continue with that. Karli does not have a lot of socialization around dogs, but with the help and confidence of her owners and slow introductions she may be able to have some canine friends. She is hoping her new family will be able to show her the ways of the world and be patient with her while she discovers new things! Karli is a love bug and can’t wait to find herself an adult, dog-savvy family that will continue to boost her self confidence and shower her with love!"
    ),
    Animal(
        162095, "Baker", R.drawable.ic_dog_baker, "American Bulldog", "Male",
        "This soulful, adorable face belongs to our buddy, Baker. Baker is an interesting combination of Party Guy and Shy Guy. While he loves to play and cuddle and go for walks, Baker is also quite unsure of new things and situations.\n" +
                "He needs a home that has the time to calmly introduce him to all things. Baker is not a dog for a first time dog owner. The best home for Baker would one with breed experience, no other pets in the house and no small children because he will unintentally knock them over! Baker is very strong and with his enthusiasm to play can be a handful. Still he is also cuddly and affectionate and a kind look goes a long way with him.\n" +
                "At only 14 months, Baker can be like a very large puppy on the loose. Obedience training is highly recommended for him to become the great adult dog we know he can be.\n" +
                "As with all bully breeds, Baker is a sensitive fellow who would love to be someone’s couch buddy. Buddy does have allergies to poultry so his diet must be monitored, otherwise he is in great shape.\n" +
                "If you are looking for a companion who can fit in for both play and quiet times, Baker may be for you.Please note, due to the current COVID-19 pandemic our adoption process has changed."
    ),
    Animal(
        162178, "Biggy", R.drawable.ic_dog_biggy, "Labrador Retriever", "Male",
        "This handsome staff pick is Biggy! Biggy is a lovely senior lab / pitbull cross around 12 years old who hasn’t been dealt the best genetic hand. He has been dealing with chronic skin and ear issues for the majority of his life, and now due to his age he is also dealing with arthritis. Biggy is looking for that very special family, that will be willing to take on his costly medications for the remainder of his days. Also he will need a home with no stairs due to his arthritis. He is such a wonderful boy, even though he is up there in years, he doesn’t seem to know it. He loves his people dearly, he’s great with dogs and even cats. Biggy also enjoys playing with his toys occasionally, and by playing we mean destroying."
    ),
    Animal(
        162102, "Winnie", R.drawable.ic_dog_winnie, "Labrador Retriever", "Female",
        "Winnie the wonderful is a social, high energy Lab mix looking for her second chance at a fur-ever family. Unfortunately Winnie’s last home wasn’t a good match for her as she lived with a few other dogs and was having some aggression towards them. Winnie is looking for a loving home where she can be the only canine. Because she can have some dog reactivity Winnie would do best with an experienced dog owner who is knowledgeable on managing this behaviour. It’s possible she may be able to get along with some dog friends with testing and proper, slow introductions but there is no guarantee. Winnie is looking for an active home who will take her on lots of adventures. She would love to join you for long walks and hikes plus other fun times. She has plenty of energy to burn! She also travels well in the vehicle on the way to those adventures. Winnie has some basic obedience but could use continued training as she does tend to do things like pull strongly on the leash. She needs a strong and confident guardian. Winnie is used to spending a lot of time with her people and not getting left alone much. She does have fairly bad separation anxiety and is currently on medication to help manage this. She will need to get used to spending time alone slowly a few minutes at a time. Winnie has lived with a cat before and may possibly be able to live with another depending on the feline. She hasn’t lived with children before but it may be possible she would be OK with older kids who are dog savvy, slow intros would be important."
    )

)
