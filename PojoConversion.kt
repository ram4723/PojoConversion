data class Menu(
    val eventId:String?=null,
    val  eventTime:String?=null,
    val eventType:String?=null,
    val metadata: Metadata?=null,
)

data class Metadata(
    val storeId:String?=null,
    val applicationId: String?=null,
    val resourceId :String?= null,
    val payload:Payload?=null,
    val resourceHref: Any? = null
)

data class Payload(
    val menuData:MenuData?=null,
)

data class MenuData(
    val menus: Map<String,MenuItem>? = null,
    val categories: Map<String,CategoriesData>? = null,
    val items: Map<String,Item>? = null,
    val modifierGroups: Map<String,ModifierGroup>? = null,
    val photos: Any? = null,
)
data class MenuItem(
    val name:String?=null,
    val categoryIds:List<String>?= null,
    val fulfillmentModes:List<String>?= null,
    val additionalCharges:List<Any>?= null,
    val id:String?=null,
    val hoursData:Time?=null
)
data class Time (
    var timeZone: String? = null,
    var regularHours: ArrayList<RegularHour>? = null,
    var specialHours: ArrayList<Any>? = null
)

data class RegularHour (
    var days: ArrayList<String>? = null,
    var timeRanges: ArrayList<TimeRange>? = null
)
data class TimeRange (
    var start: String? = null,
    var end: String? = null,
    val categories:CategoriesData?=null
)

data class CategoriesData(
 var name:String?=null,
 var description:String?=null,
 var itemIds:ArrayList<String>? = null,
 var id: String?=null,
 )
data class Item(
    var name:String?=null,
    var description:String?=null,
    var modifierGroupIds:ArrayList<Any>? = null,
    var status:Status?=null
)
data class Status(
    var saleStatus:String?=null,
    var price:Price?=null

)
data class Price(
    var currencyCode:String?=null,
    var amount:Int?=null,
    var skuDetails:SkuDetails?=null

)
data class SkuDetails(
    var skuSlug:String?=null,
    var barcodes:List<Any>?=null,
    var dietaryClassifications:List<Any>?=null,
    var allergenClassifications:List<Any>?=null,
    var containsAlcohol:Boolean?=null,
    val additionalCharges:AdditionalCharges?=null

)
data class AdditionalCharges(
    var  additionalCharges: List<Any>?=null,
    var id:String?=null,
    var  photoIds: List<Any>?=null,
    var  priceOverrides: List<Any>?=null,
)
data class ModifierGroup(
    var name:String?=null,
    var minimumSelections:Int?=null,
    var maximumSelections:Int?=null,
    var itemIds:List<String>?=null,
    var id:String?=null
)