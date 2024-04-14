## Fattery Design Pattern

### WHEN
- sub-classes တွေအများကြီးရှိတဲ့ supperclass ကနေ လိုချင်တဲ့ sub-class instance တခုကို create လုပ်တဲ့နေရာမှာသုံး
- ကျွန်တော့ရဲ့ code နမူနာ ထဲမှာကတော့  supperclass သည် interface အနေနဲ့ ElectronicDevice ကိုသုံးထားပါတယ် sub-class တွေကတော့ Computer နဲ့ ှ Smart Phone ပါ

### ADVANTAGES
- Factory design pattern ဟာ  implementation ထက် interface ပေါ်မူတည်ပီး ရေးသွားရတဲ့ pattern ဖြစ်တဲ့အတွက် OCP ကိုပြေလည်စေပါတယ်
- Class တွေရဲ့ instantiation implementation ကိုခွဲထုတ်လိုက်လို့ less couple ဖြစ်စေတယ် (SRP)
    - ဥပမာ object create မလုပ်ခင်မှာ validation စစ်တို့ကို  factory class ထဲမှာပဲလုပ်လို့ရသွားတဲ့အတွက် client program ကိုသွားထိစရာမလိုပဲလုပ်သွားလို့ရ

### IMPLEMENTATION
- Computer နဲ့  SmartPhone ဆိုတဲ့ class ၂ရှိပါတယ် အဲ class ၂ခုက ElectonicDevice ဆိုတဲ့ interface ကို implment လုပ်ထားတယ် (interface မဟုတ်ပဲ inherientence ကိုလဲသုံးလို့ရ)
- ElectronicDeviceFactory မှာကတော့ create ဆိုတဲ့ method ရှိပါမယ် သူ့မှာ ဘယ် class ကိုလိုချင်လဲဆိုတဲ့ paramter တခုပါမယ် အဲ parameter ပေါ်မူတည်ပြီး object create လုပ်ပီး ElectonicDevice interface ကို return ပြန်ပေးလိုက်ပါမယ်

### Code နမူတာ
- Basic.java : object တခုခြင်းစိကို သမရိုးကျ create လုပ်ပြထားတာပါ
- UsingFacttoryPattern.java : Factory Patter သုံးပြရေးပြထားပါတယ်
