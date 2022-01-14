package com.example.idril.data

import com.example.idril.R
import com.example.idril.model.Brand
import com.example.idril.model.Product
import com.example.idril.model.Review

object DataSource {
    val Brands = listOf(
        Brand(R.drawable.adidas,"Adidas Originals","Производитель спортивной одежды и обуви, основанный в 1949 году в Германии. «Бренд с тремя полосками» является одной из крупнейших спортивных компаний в истории. Гений инноваций, легенда теннисных кортов и всевозможных кроссовок, adidas оказал огромное влияние на индустрию спортивных товаров, моду, культуру и музыку."),
        Brand(R.drawable.calvin_klein,"Calvin Klein","Компания Calvin Klein была основана в 1968 году Келвином Кляйном и его другом детства Барри Шварцем в Нью-Йорке. Сначала ателье выпускало мужскую верхнюю одежду, затем постепенно перешло к дизайну одежды для женщин."),
        Brand(R.drawable.nike,"Nike","Компания была основана в 1964 году студентом Филом Найтом, бегуном на средние дистанции в команде Орегонского университета, и его тренером Биллом Бауэрманом. Сначала она была названа Blue Ribbon Sports, её первой операцией стал заказ 300 пар кроссовок у японской фирмы Onitsuka Tiger для перепродажи в США."),
        Brand(R.drawable.reebok,"Reebok","Компания была основана в 1958 году в качестве компаньона компании J. W. Foster and Sons, основанной в 1895 году в Болтоне, Англия. С 1958 по 1986 год вся одежда Reebok была украшена флагом Великобритании, который изображен на классическоq линии одежды Reebok, чтобы обозначить английское происхождение компании."),
        Brand(R.drawable.nina_ricci,"Nina Ricci","французский дом высокой моды, основанный в 1932 году в Париже модельером Ниной Риччи (наст. имя Мария-Аделаида Нейи; 1883—1970) по совету и при поддержке её сына, Робера Риччи (1905—1988). Начиная с 1998 года принадлежит испанской корпорации Puig."),
        Brand(R.drawable.prada,"Prada","История торговой марки началась в Милане в 1913 году, когда Марио Прада, основатель бренда, открыл небольшой магазин по продаже элегантных дорожных сумок. Применяя экзотическую мягкую кожу моржей, Марио сумел привлечь внимание влиятельных клиентов по всему миру."),
    )
    val Products = listOf(
        Product(R.drawable.im1_product,"Блуза на пуговицах","920руб","белый", "S"),
        Product(R.drawable.im2_product,"Свитшот с текстовым принтом","1350руб","синий", "M"),
        Product(R.drawable.im3_product,"Прямые брюки с высокой талией","1600руб","кофейный", "M"),
        Product(R.drawable.im4_product,"Плюшевый короткий пуловер и джоггеры","1860руб","бежевый", "L"),
        Product(R.drawable.im5_product,"Укороченный топ с длинным рукавом","850руб","черный", "XS"),
        Product(R.drawable.im6_product,"Платье из твида с узлом сзади","1300руб","белый", "S")
    )
    val Reviews = listOf(
        Review("Алина","4","Костюм нереальный , очень мягкий , приятный , а самое главное очень тёплый , сидит идеально , берите размер в размер"),
        Review("Ольга","3","Отзывов не было брала на свой страх и риск, но знаете не пожалела, в такую погоду как раз подходит брала на размер больше"),
        Review("Екатерина","5","Заказала xs,оверсайз,как и хотела! поставьте лайк пожалуйста"),
        Review("Ангелина","4", "Это потрясающе! размер S достаточно оверсайз, как я и хотела")
    )
}