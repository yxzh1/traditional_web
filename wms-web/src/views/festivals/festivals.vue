<template>
  <div class="home-view">
    <div class="layout-left">
      <!--bannder-->
      <div class="carousel-images">
        <el-image
            style="width: 100%; height: 100%"
            :src="require('@/assets/images/festivals/Festbannder.jpg')"
            fit="none"></el-image>
      </div>
      <!--      分割线-->
      <el-divider/>
      <!--      节日起源-->
      <div class="jrqy-box">
        <div class="C-tex">
          <img :src="require('@/assets/images/festivals/jrhz20180606-08.png')">
        </div>
        <div class="main-cloum">
          <div class="hr_10"></div>
          <div class="jrqy-list">
            <dl>
                  <dd>
                    <div class="tit">
                      <a href="http://www.wenming.cn/wmdjr_299/sf/sf23/202402/t20240208_6738373.shtml" target="_blank">春节的由来</a>
                    </div>
                    <div class="tit-sum">
                      <a href="http://www.wenming.cn/wmdjr_299/sf/sf23/202402/t20240208_6738373.shtml" target="_blank">春节是中国最富有特色的传统节日。“春节”这一词在不同的历史时期有不同的特指，汉朝时，人们把二十四节气中的立春称为春节。 </a>
                    </div>
                  </dd>
            </dl>
            <dl>
              <dd>
                <div class="tit">
                  <a href="http://www.wenming.cn/wmdjr_299/yxj/qy/201902/t20190213_5002287.shtml" target="_blank">元宵节的由来</a>
                </div>
                <div class="tit-sum" style="bottom: 130px">
                  <a href="http://www.wenming.cn/wmdjr_299/yxj/qy/201902/t20190213_5002287.shtml" target="_blank" >农历正月十五是元宵节，又称上元节、元夜、灯节。正月是农历的元月，古人称夜为“宵”，所以称正月十五为元宵节。 </a>
                </div>
              </dd>
            </dl>
            <dl>
              <dd>
                <div class="tit">
                  <a href="http://www.wenming.cn/wmdjr_299/qmj/qy/202004/t20200403_5511235.shtml" target="_blank">清明起源</a>
                </div>
                <div class="tit-sum" style="bottom: 80px">
                  <a href="http://www.wenming.cn/wmdjr_299/qmj/qy/202004/t20200403_5511235.shtml" target="_blank">在中国传统文化里，清明节是一个纪念祖先及离世亲人的节日。主要的纪念仪式是扫墓，并伴以踏青、植树等活动，节日体现饮水思源、凝聚族群、迎春健身及关爱自然的意义。 </a>
                </div>
              </dd>
            </dl>
            <dl>
              <dd style="position: relative; bottom: 50px">
                <div class="tit">
                  <a href="http://www.wenming.cn/wmdjr_299/dwj/qy/202306/t20230616_6622074.shtml" target="_blank">端午节的由来</a>
                </div>
                <div class="tit-sum" style="bottom: 130px">
                  <a href="http://www.wenming.cn/wmdjr_299/dwj/qy/202306/t20230616_6622074.shtml" target="_blank" >端午节起源于古代长江中游以龙为图腾的越民族，每年的农历五月五日他们都要举行一次盛大的“图腾祭”，以表示其“龙子”身份。 </a>
                </div>
              </dd>
            </dl>
            <dl>
              <dd style="position: relative; bottom: 50px">
                <div class="tit">
                  <a href="http://www.wenming.cn/wmdjr_299/7x/qy/201807/t20180706_4749030.shtml" target="_blank">七夕节起源</a>
                </div>
                <div class="tit-sum">
                  <a href="http://www.wenming.cn/wmdjr_299/7x/qy/201807/t20180706_4749030.shtml" target="_blank">七夕，原名为乞巧节。七夕乞巧，这个节日起源于汉代，东晋葛洪的《西京杂记》有“汉彩女常以七月七日穿七孔针于开襟楼，人俱习之”的记载。 </a>
                </div>
              </dd>
            </dl>
            <dl>
              <dd style="position: relative; bottom: 50px">
                <div class="tit">
                  <a href="http://www.wenming.cn/wmdjr_299/zqj/qy/201809/t20180910_4824464.shtml" target="_blank">中秋节起源</a>
                </div>
                <div class="tit-sum">
                  <a href="http://www.wenming.cn/wmdjr_299/zqj/qy/201809/t20180910_4824464.shtml" target="_blank">中秋节有悠久的历史。古代帝王有春天祭日，秋天祭月的礼制，早在《周礼》一书中，已有“中秋”一词的记载。后来贵族和文人学士也仿效起来，在中秋时节，对着天上又亮又圆一轮皓月，观赏祭拜，寄托情怀，这种习俗就这样传到民间，形成一个传统的活动，一直到了唐代，这种祭月的风俗更为人们重视，中秋节才成为固定的节日，《唐书·太宗记》记载有“八月十五中秋节”，这个节日盛行于宋朝，至明清时，已与元旦齐名，成为我国的主要节日之一。 </a>
                </div>
              </dd>
            </dl>
          </div>
        </div>
      </div>

      <!--      节日传说-->
      <div class="jrcs-box">
        <div class="C-tex">
          <img :src="require('@/assets/images/festivals/jrhz20180606-09.png')">
        </div>
        <div class="hr_10 hr_30"></div>
        <div class="main-cloum">
          <div class="cloum01 left" style="position: relative; left: 50px">
            <div class="cs-box">
              <div class="tab-bd">
                <li :style="getListItemStyle(0)">
                  <div class="pannel-image left">
                    <a href="#" target="_blank">
                      <img :src="require('@/assets/images/festivals/W020180612325951234944.jpg')" alt="未标题-1.jpg" title="" width="330" height="220">
                    </a>
                  </div>
                  <div class="image-tit"><a href="http://www.wenming.cn/wmdjr_299/sf/chshuo/201806/t20180608_4716836.shtml" target="_blank" title="春节的传说">春节的传说</a></div>
                  <div class="image-sum"><a href="http://www.wenming.cn/wmdjr_299/sf/chshuo/201806/t20180608_4716836.shtml" target="_blank">春节最初的含意来自农业，古时人们把谷的生长周期称为“年”。在夏商时代产生了夏历，以月亮圆缺的周期为月，一年划分为十二个月，每月以不见月亮的那天为朔，正月朔日的子时称为岁首，即一年的开始，也叫年。  </a></div>
                  <div class="hr_10"></div>
                  <div class="img"><img :src="require('@/assets/images/festivals/jrhz20180606-28.png')"></div>
                  <div class="hr_1"></div>
                  <div class="jr-list">
                    <dl>

                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/sf/chshuo/201806/t20180608_4716836.shtml" target="_blank" title="春节的传说">春节的传说</a>】</dd>

                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/sf/chshuo/201806/t20180608_4716835.shtml" target="_blank" title="门神的传说">门神的传说</a>】</dd>

                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/sf/chshuo/201806/t20180608_4716829.shtml" target="_blank" title="“年”怪的传说">“年”怪的传说</a>】</dd>

                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/sf/chshuo/201806/t20180608_4716832.shtml" target="_blank" title="桃符的传说">桃符的传说</a>】</dd>

                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/sf/chshuo/201806/t20180608_4716828.shtml" target="_blank" title="“五福临门”原指长寿、富贵、康宁、好德、善终">“五福临门”原指长寿、富贵、康宁、好德、善终</a>】</dd>

                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/sf/chshuo/201806/t20180608_4716827.shtml" target="_blank" title="万事有起源 第一副春联是谁写的？">万事有起源 第一副春联是谁写的？</a>】</dd>

                    </dl>
                  </div>
                  <div class="hr_1"></div>
                  <div class="img right"><img :src="require('@/assets/images/festivals/jrhz20180606-29.png')"></div>
                </li>
                <li :style="getListItemStyle(1)">
                  <div class="pannel-image left">
                    <a href="http://www.wenming.cn/wmdjr_299/yxj/cs/202210/t20221019_6495862.shtml" target="_blank">
                      <img :src="require('@/assets/images/festivals/W020221019574277046562.jpg')" alt="" title='' width='330' height='220' />
                    </a>
                  </div>
                  <div class="image-tit"><a href="http://www.wenming.cn/wmdjr_299/yxj/cs/202210/t20221019_6495862.shtml" target="_blank" title="关于灯的传说">关于灯的传说</a></div>
                  <div class="image-sum"><a href="http://www.wenming.cn/wmdjr_299/yxj/cs/202210/t20221019_6495862.shtml" target="_blank">传说在很久以前，凶禽猛兽很多，四处伤害人和牲畜，人们就组织起来去打它们，有一只神鸟困为迷路而降落人间，却意外的被不知情的猎人给射死了。天帝知道后十分震怒，下令让天兵于正月十五日到人间放火。 </a></div>

                  <div class="hr_10"></div>
                  <div class="img"><img :src="require('@/assets/images/festivals/jrhz20180606-28.png')" /></div>
                  <div class="hr_1"></div>
                  <div class="jr-list">
                    <dl>
                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/yxj/cs/202210/t20221019_6495859.shtml" target="_blank" title="东方朔与元宵姑娘">东方朔与元宵姑娘</a>】</dd>

                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/yxj/cs/202210/t20221019_6495858.shtml" target="_blank" title="点彩灯来历">点彩灯来历</a>】</dd>

                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/yxj/cs/201902/t20190213_5002301.shtml" target="_blank" title="明帝敬佛">明帝敬佛</a>】</dd>

                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/yxj/cs/201902/t20190213_5002300.shtml" target="_blank" title="“三元说”">“三元说”</a>】</dd>

                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/yxj/cs/201902/t20190213_5002294.shtml" target="_blank" title="纪念“平吕”">纪念“平吕”</a>】</dd>

                    </dl>
                  </div>
                  <div class="hr_1"></div>
                  <div class="img right"><img :src="require('@/assets/images/festivals/jrhz20180606-29.png')" /></div>
                </li>
                <li :style="getListItemStyle(2)">
                  <div class="pannel-image left"><a href="http://www.wenming.cn/wmdjr_299/qmj/cs/202210/t20221019_6495867.shtml" target="_blank"><img :src="require('@/assets/images/festivals/W020221019574465717083.jpg')" alt="" title='' width='330' height='220' /></a></div>
                  <div class="image-tit"><a href="http://www.wenming.cn/wmdjr_299/qmj/cs/202210/t20221019_6495867.shtml" target="_blank" title="戴柳插柳的来历">戴柳插柳的来历</a></div>
                  <div class="image-sum"><a href="http://www.wenming.cn/wmdjr_299/qmj/cs/202210/t20221019_6495867.shtml" target="_blank">清明节植树的习俗，发端于清明戴柳插柳的风俗。是什么原因使得平凡的柳条有了如此非同寻常的意义？最古老的传说，是说为了纪念教民稼穑耕作的祖师—神农氏，后来由此发展出祈求长寿的意蕴。 </a></div>

                  <div class="hr_10"></div>
                  <div class="img"><img :src="require('@/assets/images/festivals/jrhz20180606-28.png')" /></div>
                  <div class="hr_1"></div>
                  <div class="jr-list">
                    <dl>

                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/qmj/cs/202210/t20221019_6495866.shtml" target="_blank" title="清明节的传说">清明节的传说</a>】</dd>

                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/qmj/cs/202210/t20221019_6495865.shtml" target="_blank" title="介子推的故事">介子推的故事</a>】</dd>

                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/qmj/cs/202210/t20221019_6495864.shtml" target="_blank" title="植树节的来历">植树节的来历</a>】</dd>


                    </dl>
                  </div>
                  <div class="hr_1"></div>
                  <div class="img right"><img :src="require('@/assets/images/festivals/jrhz20180606-29.png')" /></div>
                </li>
                <li :style="getListItemStyle(3)">
                  <div class="pannel-image left"><a href="http://www.wenming.cn/wmdjr_299/dwj/cs/202306/t20230616_6622115.shtml" target="_blank"><img :src="require('@/assets/images/festivals/W020230619298141717430.jpg')" title='' width='330' height='220' /></a></div>
                  <div class="image-tit"><a href="http://www.wenming.cn/wmdjr_299/dwj/cs/202306/t20230616_6622115.shtml" target="_blank" title="端午节为什么要挂艾草">端午节为什么要挂艾草</a></div>
                  <div class="image-sum"><a href="http://www.wenming.cn/wmdjr_299/dwj/cs/202306/t20230616_6622115.shtml" target="_blank">民谚说：“清明插柳，端午插艾”。在端午节，人们把插艾和菖蒲作为过端午节的重要内容之一。家家都洒扫庭除，以菖蒲、艾条插于门眉，悬于堂中。 </a></div>

                  <div class="hr_10"></div>
                  <div class="img"><img :src="require('@/assets/images/festivals/jrhz20180606-28.png')" /></div>
                  <div class="hr_1"></div>
                  <div class="jr-list">
                    <dl>

                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/dwj/cs/201806/t20180608_4716900.shtml" target="_blank" title="端午节罕见别称">端午节罕见别称</a>】</dd>

                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/dwj/cs/201806/t20180608_4716909.shtml" target="_blank" title="黄巢与端午节插菖蒲艾草的习俗">黄巢与端午节插菖蒲艾草的习俗</a>】</dd>

                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/dwj/cs/201806/t20180608_4716908.shtml" target="_blank" title="三闾大夫屈原的传说">三闾大夫屈原的传说</a>】</dd>

                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/dwj/cs/201806/t20180608_4716898.shtml" target="_blank" title="钟馗捉鬼的传说">钟馗捉鬼的传说</a>】</dd>

                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/dwj/cs/201806/t20180615_4724708.shtml" target="_blank" title="龙的节日说">龙的节日说</a>】</dd>

                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/dwj/cs/201806/t20180615_4724693.shtml" target="_blank" title="纪念伍子胥">纪念伍子胥</a>】</dd>

                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/dwj/cs/201806/t20180615_4724699.shtml" target="_blank" title="纪念孝女曹娥">纪念孝女曹娥</a>】</dd>

                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/dwj/cs/201806/t20180615_4724703.shtml" target="_blank" title="图腾祭">图腾祭</a>】</dd>

                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/dwj/cs/201806/t20180615_4724713.shtml" target="_blank" title="夏至说">夏至说</a>】</dd>

                    </dl>
                  </div>
                  <div class="hr_1"></div>
                  <div class="img right"><img :src="require('@/assets/images/festivals/jrhz20180606-29.png')" /></div>
                </li>
                <li :style="getListItemStyle(4)">
                  <div class="pannel-image left"><a href="http://www.wenming.cn/wmdjr_299/7x/cs/202210/t20221019_6495871.shtml" target="_blank"><img :src="require('@/assets/images/festivals/W020221019575167138590.jpg')" alt="" title='' width='330' height='220' /></a></div>
                  <div class="image-tit"><a href="http://www.wenming.cn/wmdjr_299/7x/cs/202210/t20221019_6495871.shtml" target="_blank" title="七夕乞巧">七夕乞巧</a></div>
                  <div class="image-sum"><a href="http://www.wenming.cn/wmdjr_299/7x/cs/202210/t20221019_6495871.shtml" target="_blank">七夕乞巧，这个节日起源于汉代，东晋葛洪的《西京杂记》有“汉彩女常以七月七日穿七孔针于开襟楼，人俱习之”的记载，这便是我们于古代文献中所见到的最早的关于乞巧的记载。 </a></div>

                  <div class="hr_10"></div>
                  <div class="img"><img :src="require('@/assets/images/festivals/jrhz20180606-28.png')" /></div>
                  <div class="hr_1"></div>
                  <div class="jr-list">
                    <dl>

                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/7x/cs/202210/t20221019_6495870.shtml" target="_blank" title="关于牛郎织女的传说">关于牛郎织女的传说</a>】</dd>

                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/7x/cs/201808/t20180811_4792237.shtml" target="_blank" title="穿越回古代，七夕怎么过">穿越回古代，七夕怎么过</a>】</dd>

                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/7x/cs/201807/t20180730_4777796.shtml" target="_blank" title="“七”与“期”同音">“七”与“期”同音</a>】</dd>

                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/7x/cs/201807/t20180730_4777787.shtml" target="_blank" title="七七生命周期">七七生命周期</a>】</dd>

                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/7x/cs/201807/t20180730_4777750.shtml" target="_blank" title="女孩儿节">女孩儿节</a>】</dd>

                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/7x/cs/201807/t20180727_4776180.shtml" target="_blank" title="魁星传说">魁星传说</a>】</dd>


                    </dl>
                  </div>
                  <div class="hr_1"></div>
                  <div class="img right"><img :src="require('@/assets/images/festivals/jrhz20180606-29.png')" /></div>
                </li>
                <li :style="getListItemStyle(5)">
                  <div class="pannel-image left"><a href="http://www.wenming.cn/wmdjr_299/zqj/cs/202210/t20221019_6495878.shtml" target="_blank"><img :src="require('@/assets/images/festivals/W020221019575609651423.jpg')" alt="" title='' width='330' height='220' /></a></div>
                  <div class="image-tit"><a href="http://www.wenming.cn/wmdjr_299/zqj/cs/202210/t20221019_6495878.shtml" target="_blank" title="嫦娥奔月">嫦娥奔月</a></div>
                  <div class="image-sum"><a href="http://www.wenming.cn/wmdjr_299/zqj/cs/202210/t20221019_6495878.shtml" target="_blank">远古时候天上有十日同时出现，晒得庄稼枯死，民不聊生，一个名叫后羿的英雄，力大无穷，他同情受苦的百姓，拉开神弓，一气射下九个多太阳，并严令最后一个太阳按时起落，为民造福。 </a></div>

                  <div class="hr_10"></div>
                  <div class="img"><img :src="require('@/assets/images/festivals/jrhz20180606-28.png')" /></div>
                  <div class="hr_1"></div>
                  <div class="jr-list">
                    <dl>

                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/zqj/cs/202210/t20221019_6495877.shtml" target="_blank" title="月饼起义">月饼起义</a>】</dd>

                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/zqj/cs/202210/t20221019_6495876.shtml" target="_blank" title="玄宗故事">玄宗故事</a>】</dd>

                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/zqj/cs/202210/t20221019_6495875.shtml" target="_blank" title="玉兔捣药">玉兔捣药</a>】</dd>

                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/zqj/cs/202210/t20221019_6495874.shtml" target="_blank" title="吴刚折桂">吴刚折桂</a>】</dd>

                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/zqj/cs/201809/t20180910_4824481.shtml" target="_blank" title="月下独酌">月下独酌</a>】</dd>

                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/zqj/cs/201809/t20180910_4824480.shtml" target="_blank" title="貂蝉拜月">貂蝉拜月</a>】</dd>


                    </dl>
                  </div>
                  <div class="hr_1"></div>
                  <div class="img right"><img :src="require('@/assets/images/festivals/jrhz20180606-29.png')" /></div>
                </li>
                <li :style="getListItemStyle(6)">
                  <div class="pannel-image left"><a href="http://www.wenming.cn/wmdjr_299/cyj/cs/202310/t20231020_6686526.shtml" target="_blank"><img :src="require('@/assets/images/festivals/W020231020646234206226.jpg')" alt="" title='' width='330' height='220' /></a></div>
                  <div class="image-tit"><a href="http://www.wenming.cn/wmdjr_299/cyj/cs/202310/t20231020_6686526.shtml" target="_blank" title="重阳节的神话传说">重阳节的神话传说</a></div>
                  <div class="image-sum"><a href="http://www.wenming.cn/wmdjr_299/cyj/cs/202310/t20231020_6686526.shtml" target="_blank">根据《周易》的理论，“六”为阴数，“九”为阳数，所以九月九，就是九又重九、阳数相重的日子，这才有了“重阳节”的名称由来，也称“重九节”。 </a></div>

                  <div class="hr_10"></div>
                  <div class="img"><img :src="require('@/assets/images/festivals/jrhz20180606-28.png')" /></div>
                  <div class="hr_1"></div>
                  <div class="jr-list">
                    <dl>

                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/cyj/cs/202310/t20231020_6686540.shtml" target="_blank" title="重阳节是在过什么？">重阳节是在过什么？</a>】</dd>

                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/cyj/cs/202310/t20231020_6686541.shtml" target="_blank" title="四大名著里的重阳故事，你了解吗？">四大名著里的重阳故事，你了解吗？</a>】</dd>

                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/cyj/cs/202310/t20231020_6686542.shtml" target="_blank" title="重阳节文化">重阳节文化</a>】</dd>

                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/cyj/cs/202210/t20221019_6495882.shtml" target="_blank" title="重阳节的名称得来">重阳节的名称得来</a>】</dd>

                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/cyj/cs/201810/t20181010_4855272.shtml" target="_blank" title="骊山传说">骊山传说</a>】</dd>

                      <dd>【<a href="http://www.wenming.cn/wmdjr_299/cyj/cs/201810/t20181010_4855246.shtml" target="_blank" title="重阳与菊花仙子的传说">重阳与菊花仙子的传说</a>】</dd>


                    </dl>
                  </div>
                  <div class="hr_1"></div>
                  <div class="img right"><img :src="require('@/assets/images/festivals/jrhz20180606-29.png')" /></div>
                </li>
              </div>
            </div>
          </div>

          <div class="cloum02 right" style="position: relative; right: 150px; ">
            <div class="nr-box">
              <div class="tab">
                <ul class="tab-hd">
                  <li :class="{ 'cj': true, 'active': activeIndex === 0 }" @mouseenter="handleMouseEnter(0)"><a>&nbsp;</a></li>
                  <li :class="{ 'yx': true, 'active': activeIndex === 1 }" @mouseenter="handleMouseEnter(1)"><a>&nbsp;</a></li>
                  <li :class="{ 'qm': true, 'active': activeIndex === 2 }" @mouseenter="handleMouseEnter(2)"><a>&nbsp;</a></li>
                  <li :class="{ 'dw': true, 'active': activeIndex === 3 }" @mouseenter="handleMouseEnter(3)"><a>&nbsp;</a></li>
                  <li :class="{ 'qx': true, 'active': activeIndex === 4 }" @mouseenter="handleMouseEnter(4)"><a>&nbsp;</a></li>
                  <li :class="{ 'zq': true, 'active': activeIndex === 5 }" @mouseenter="handleMouseEnter(5)"><a>&nbsp;</a></li>
                  <li :class="{ 'cy': true, 'active': activeIndex === 6 }" @mouseenter="handleMouseEnter(6)"><a>&nbsp;</a></li>
                </ul>
              </div>
            </div>
          </div>
        </div>


      </div>

      <!--      节日民俗-->
      <div class="jrms-box">
        <div class="C-tex"><img :src="require('@/assets/images/festivals/jrhz20180606-10.png')" /></div>
        <div class="hr_10 hr_30"></div>
        <div class="main-cloum">
          <div class="foucua01">
            <div class="tempWrap" style="overflow: hidden; position: relative; width: 1200px; left: 200px">
              <ul class="slides_item" :style="getSlidesItem()">
                <li style="float: left; width: 1200px;">
                  <div class="img-1000-540">
                    <img :src="require('@/assets/images/festivals/jrhz20180614-1.jpg')" width="1000" height="500" border="0" usemap="#Map1" />
                    <map name="Map1" id="Map1">
                      <area shape="rect" coords="245,90,286,199" href="http://www.wenming.cn/wmdjr_299/sf/ms/202401/t20240102_6721547.shtml" target="_blank" /> <!--贴年画-->
                      <area shape="rect" coords="285,310,326,409" href="http://www.wenming.cn/wmdjr_299/sf/ms/202401/t20240102_6721562.shtml" target="_blank" /> <!--逛庙会-->
                      <area shape="rect" coords="471,105,506,220" href="http://www.wenming.cn/wmdjr_299/sf/ms/202401/t20240102_6721575.shtml" target="_blank" /> <!--贴福字-->
                      <area shape="rect" coords="682,268,715,369" href="http://www.wenming.cn/wmdjr_299/sf/ms/202401/t20240102_6721581.shtml" target="_blank" /> <!--接对联-->
                      <area shape="rect" coords="719,108,754,204" href="http://www.wenming.cn/wmdjr_299/sf/ms/202401/t20240102_6721577.shtml" target="_blank" /> <!--祭灶神-->
                    </map>
                  </div>
                </li>

                <li style="float: left; width: 1200px;">
                  <div class="img-1000-540">
                    <img :src="require('@/assets/images/festivals/jrhz20180614-2.jpg')" width="1000" height="500" border="0" usemap="#Map3" />
                    <map name="Map3" id="Map3">
                      <area shape="rect" coords="80,388,123,487" href="http://www.wenming.cn/wmdjr_299/yxj/ms/201806/t20180615_4724827.shtml" target="_blank" /> <!--吃元宵-->
                      <area shape="rect" coords="120,127,157,233" href="http://www.wenming.cn/wmdjr_299/yxj/ms/201806/t20180615_4724817.shtml" target="_blank" /> <!--舞狮-->
                      <area shape="rect" coords="397,359,434,457" href="http://www.wenming.cn/wmdjr_299/yxj/ms/201806/t20180615_4724816.shtml" target="_blank" /> <!--送花灯-->
                      <area shape="rect" coords="564,107,606,212" href="http://www.wenming.cn/wmdjr_299/yxj/qy/201806/t20180615_4725034.shtml" target="_blank" /> <!--起源-->
                      <area shape="rect" coords="755,365,790,469" href="http://www.wenming.cn/wmdjr_299/yxj/ms/201806/t20180615_4724821.shtml" target="_blank" /> <!--舞龙-->
                    </map>
                  </div>
                </li>

                <li style="float: left; width: 1200px;">
                  <div class="img-1000-540">
                    <img :src="require('@/assets/images/festivals/jrhz20180606-qm.jpg')" width="1000" height="540" border="0" usemap="#Map4" />
                    <map name="Map4" id="Map4">
                      <area shape="rect" coords="381,178,408,235" href="http://www.wenming.cn/wmdjr_299/qmj/ms/201806/t20180615_4724845.shtml" target="_blank" /> <!--踏青-->
                      <area shape="rect" coords="273,363,297,417" href="http://www.wenming.cn/wmdjr_299/qmj/ms/201806/t20180615_4724843.shtml" target="_blank" /> <!--插柳-->
                      <area shape="rect" coords="513,315,539,393" href="http://www.wenming.cn/wmdjr_299/qmj/ms/201806/t20180615_4724839.shtml" target="_blank" /> <!--放风筝-->
                      <area shape="rect" coords="657,349,735,379" href="http://www.wenming.cn/wmdjr_299/qmj/ms/201806/t20180615_4725135.shtml" target="_blank" /> <!--荡秋千-->
                      <area shape="rect" coords="782,260,833,294" href="http://www.wenming.cn/wmdjr_299/qmj/ms/201806/t20180615_4724841.shtml" target="_blank" />
                    </map>
                  </div>
                </li>
                <!--端午-->
                <li style="float: left; width: 1200px;">
                  <div class="img-1000-540">
                    <img :src="require('@/assets/images/festivals/jrdw20180615-3.jpg')" width="1000" height="500" border="0" usemap="#Map" />
                    <map name="Map" id="Map">
                      <area shape="rect" coords="268,59,326,175" href="http://www.wenming.cn/wmdjr_299/dwj/ms/201806/t20180615_4724731.shtml" target="_blank"/>
                      <area shape="rect" coords="242,311,304,465" href="http://www.wenming.cn/wmdjr_299/dwj/ms/201806/t20180615_4724770.shtml" target="_blank"/>
                      <area shape="rect" coords="410,207,460,301" href="http://www.wenming.cn/wmdjr_299/dwj/ms/201806/t20180615_4724759.shtml" target="_blank"/>
                      <area shape="rect" coords="586,303,638,405" href="http://www.wenming.cn/wmdjr_299/dwj/ms/201806/t20180615_4724750.shtml" target="_blank"/>
                      <area shape="rect" coords="704,130,750,226" href="http://www.wenming.cn/wmdjr_299/dwj/ms/201806/t20180615_4724765.shtml" target="_blank"/>
                    </map>
                  </div>
                </li>
                <!--七夕-->
                <li style="float: left; width: 1200px;">
                  <div class="img-1000-540">
                    <img :src="require('@/assets/images/festivals/jrhz20180614-3.jpg')" width="1000" height="500" border="0" usemap="#Map5" />
                    <map name="Map5" id="Map5">
                      <area shape="rect" coords="79,85,267,339" href="http://www.wenming.cn/wmdjr_299/7x/ms/201806/t20180615_4725207.shtml" target="_blank" /> <!--晒书晒衣-->
                      <area shape="rect" coords="296,3,471,238" href="http://www.wenming.cn/wmdjr_299/7x/ms/201806/t20180615_4725179.shtml" target="_blank" /> <!--穿针乞巧-->
                      <area shape="rect" coords="293,268,466,490" href="http://www.wenming.cn/wmdjr_299/7x/ms/201806/t20180615_4725203.shtml" target="_blank" /> <!--吃巧果-->
                      <area shape="rect" coords="509,86,668,331" href="http://www.wenming.cn/wmdjr_299/7x/ms/201806/t20180615_4725188.shtml" target="_blank" /> <!--节日传说-->
                      <area shape="rect" coords="692,11,864,242" href="http://www.wenming.cn/wmdjr_299/7x/ms/201806/t20180615_4725192.shtml" target="_blank" /> <!--投针验巧-->
                      <area shape="rect" coords="690,271,863,483" href="http://www.wenming.cn/wmdjr_299/7x/ms/201806/t20180615_4725213.shtml" target="_blank" /> <!--观星-->
                    </map>
                  </div>
                </li>

                <li style="float: left; width: 1200px;">
                  <div class="img-1000-540">
                    <img :src="require('@/assets/images/festivals/jrhz20180614-4.jpg')" width="1000" height="500" border="0" usemap="#Map6" />
                    <map name="Map6" id="Map6">
                      <area shape="rect" coords="62,252,256,440" href="http://www.wenming.cn/wmdjr_299/zqj/ms/201806/t20180615_4725261.shtml" target="_blank" /> <!--放孔明灯-->
                      <area shape="rect" coords="181,28,363,226" href="http://www.wenming.cn/wmdjr_299/zqj/ms/201806/t20180615_4725227.shtml" target="_blank" /> <!--拜月-->
                      <area shape="rect" coords="389,302,581,491" href="http://www.wenming.cn/wmdjr_299/zqj/ms/201806/t20180615_4725236.shtml" target="_blank" /> <!--博饼-->
                      <area shape="rect" coords="513,50,714,241" href="http://www.wenming.cn/wmdjr_299/zqj/ms/201806/t20180615_4725231.shtml" target="_blank" /> <!--月饼-->
                      <area shape="rect" coords="743,264,925,457" href="http://www.wenming.cn/wmdjr_299/zqj/ms/201806/t20180615_4725278.shtml" target="_blank" /> <!--起源-->
                    </map>
                  </div>
                </li>

                <li style="float: left; width: 1200px;">
                  <div class="img-1000-540">
                    <img :src="require('@/assets/images/festivals/jrhz20180606-32.jpg')" width="1000" height="540" border="0" usemap="#Map2" />
                    <map name="Map2" id="Map2">
                      <area shape="rect" coords="418,52,446,143" href="http://www.wenming.cn/wmdjr_299/cyj/ms/202310/t20231020_6686550.shtml" target="_blank" /> <!--节日起源-->
                      <area shape="rect" coords="603,153,651,179" href="http://www.wenming.cn/wmdjr_299/cyj/ms/202310/t20231020_6686545.shtml" target="_blank" /> <!--登高-->
                      <area shape="rect" coords="703,134,766,160" href="http://www.wenming.cn/wmdjr_299/cyj/ms/202310/t20231020_6686547.shtml" target="_blank" /> <!--插-->
                      <area shape="rect" coords="158,410,212,439" href="http://www.wenming.cn/wmdjr_299/cyj/ms/202310/t20231020_6686548.shtml" target="_blank" /> <!--赏菊-->
                      <area shape="rect" coords="323,407,397,436" href="http://www.wenming.cn/wmdjr_299/cyj/ms/202310/t20231020_6686549.shtml" target="_blank" /> <!--菊花酒-->
                      <area shape="rect" coords="670,419,751,448" href="http://www.wenming.cn/wmdjr_299/cyj/ms/202310/t20231020_6686546.shtml" target="_blank" /> <!--重阳美食-->
                    </map>
                  </div>
                </li>
              </ul>
            </div>

            <a class="prev" style="left: 160px" href="javascript:void(0)" @click="reduceJrms()"></a>
            <a class="next" style="right: 180px" href="javascript:void(0)" @click="addJrms()"></a>
          </div>
        </div>
      </div>

    </div>
  </div>
</template>

<script>

export default {
  name: "festivalsP",
  components:{},
  data(){
    return{
      activeIndex: 0, // 默认为第1个项（索引从0开始）

      jrmsIndex: 0,
    }
  },
  methods:{
    getSlidesItem(){
      if(this.jrmsIndex === 0){
        return 'left: 0'
      }
      if(this.jrmsIndex === 1){
        return 'left: -1200px'
      }
      if(this.jrmsIndex === 2){
        return 'left: -2400px'
      }
      if(this.jrmsIndex === 3){
        return 'left: -3600px'
      }
      if(this.jrmsIndex === 4){
        return 'left: -4800px'
      }
      if(this.jrmsIndex === 5){
        return 'left: -6000px'
      }
      if(this.jrmsIndex === 6){
        return 'left: -7200px'
      }
    },
    reduceJrms(){
      this.jrmsIndex = this.jrmsIndex - 1
      if(this.jrmsIndex <0){
        this.jrmsIndex = 6
      }
    },
    addJrms(){
      this.jrmsIndex = this.jrmsIndex + 1
      if(this.jrmsIndex >6){
        this.jrmsIndex = 0
      }
    },
    getListItemStyle(index){
      return index === this.activeIndex ? 'display: list-item' : 'display: none';
    },
    handleMouseEnter(index) {
      this.activeIndex = index;
    },
  },
}
</script>

<style lang="less" scoped>

.home-view{
  .layout-left{
    position: relative;
    flex: 1;
    box-shadow: 0 0 3px #dddddd;
    .carousel-images{
      width: 100%;
      margin: 0 auto;
    }
    .main-content{
      .main-left{
        .nav-container{
          .active{
            background-color: rgba(255, 138, 0,0.7);
            color: white;
            border-bottom: 4px solid rgba(255, 138, 0,1);
          }
        }
      }
    }

    .home-pagination{
      //position: absolute;
      //left: 0;
      //bottom: 0;
      border: 1px solid #ddd;
      padding: 10px;
      border-radius: 5px;
    }
    .foucua02, .foucua01, .foucua03 {
      position: relative;
      overflow: hidden;
    }
    .slides_item{
      width:10800px;
      padding:0;
      margin:0;
      position: relative;
      overflow: hidden;
    }
    .img-1000-540 {
      width: 1000px;
      margin: 0 auto;
      padding: 20px;
      background-color: #fff;
    }
    map {
      display: inline;
    }
    area:-webkit-any-link {
      cursor: pointer;
    }
    area {
      display: inline;
    }
    .foucua01 .prev {
      left: 0;
    }

    .foucua01 .prev, .foucua01 .next {
      background: url('~@/assets/images/festivals/jrhz20180606-17.png') no-repeat left top;
      width: 54px;
      height: 106px;
      position: absolute;
      top: 200px;
    }
    .foucua01 .next {
      background-position: right top;//需要把background-position放在background: url('') no-repeat;的后面，否则不起效果
      right: 0;
    }

    .jrqy-box{
      height: 705px;
      overflow: hidden;
      background: url('~@/assets/images/festivals/jrhz20180606-21.jpg') no-repeat center top;
    }
    .jrcs-box {
      height: 700px;
      overflow: hidden;
      background: url('~@/assets/images/festivals/jrhz20180606-22.jpg') no-repeat center top;
    }
    .jrms-box {
      height: 760px;
      overflow: hidden;
      background: url('~@/assets/images/festivals/jrhz20180606-23.jpg') no-repeat center top;
    }

    .C-tex{
      text-align: center;
    }

    .hr_10{
      height: 10px;
      clear: both;
      font-size: 1px;
      line-height: 1px;
      overflow: hidden;
    }

    .jrqy-list{
      display: flex;
      flex-wrap: wrap;
    }
    dl,dd{
      flex-basis: 33.33%; /* 每个元素占据一行的 33.33% 宽度 */
      box-sizing: border-box; /* 盒模型的计算方式设置为 border-box */
    }
    .jr-list dl{
      //white-space: nowrap; /* 防止文字换行 */
      //overflow-x: auto; /* 横向滚动溢出内容 */
      //padding-bottom: 10px; /* 调整下方间距 */
    }
    .jr-list dd{
      display: inline-block;/*水平排列，如果一行放不下，则会自动换行*/
      //margin-right: 10px; /* 调整相邻dd之间的间距 */
    }
    .jr-list dl dd {
      font-size: 20px;
      line-height: 30px;
    }
    dl {
      display: block;
      margin-block-start: 1em;
      margin-block-end: 1em;
      margin-inline-start: 0px;
      margin-inline-end: 0px;
    }
    dd {
      line-height: 25px;
      display: block;
      margin-inline-start: 40px;
    }
    .jrqy-list dl dd {
      overflow: hidden;
      background: url('~@/assets/images/festivals/jrhz20180606-14.jpg') no-repeat;
    }

    .tit {
      position: relative;
      left: 38px;
      top: 30px;
      width: 30px;
      font-size: 18px;
      color: #6c6c6c;
      //z-index: 1;
    }
    .tit-sum {
      position: relative;
      left: 90px;
      bottom: 100px;
      width: 260px;
      font-size: 18px;
      color: #8c8c8c;
      text-indent: 2em;
      line-height: 35px;
      //z-index: 1;

      display: -webkit-box;
      overflow: hidden;
      text-overflow: ellipsis;
      word-break: break-all;
      -webkit-box-orient: vertical;
      -webkit-line-clamp: 5;//此处为行数，可以改为任意数字
    }
    .tit a {
      color: #6c6c6c;
      font-size: 22px;
      font-weight: bold;
      font-family: "微软雅黑",serif;
    }
    a {
      text-decoration: none;
      color: #000;
    }
    a:hover{
      color: #f56c6c;
    }

    .hr_30{
      height: 30px;
    }
    .hr_10 .hr_30{
      height: 10px;
      clear: both;
      font-size: 1px;
      line-height: 1px;
      overflow: hidden;
    }
    .cloum01 {
      width: 810px;
    }
    .left {
      float: left;
    }

    .cs-box, .nr-box {
      background: #fff;
      overflow: hidden;
      padding: 30px;
    }
    .nr-box{
      padding-left: 1px;
    }
    .cs-box{
      position: relative;
      left: 70px;
    }
    .tab-bd li {
      display: none;
    }
    li {
      line-height: 36px;
      list-style: none;
    }

    .image-tit {
      font-size: 30px;
      color: #8f1414;
      font-weight: bold;
    }
    .image-tit a{
      position: relative;
      left: 100px;
    }
    .image-sum {
      font-size: 20px;
      line-height: 40px;
      color: #888;
      padding-top: 10px;
      text-indent: 2em;
    }
    .image-sum  a{
      position: relative;
      left: 15px;
    }
    .hr_1 {
      height: 1px;
    }
    .right {
      float: right;
    }

    ul {
      padding: 0;
      margin: 0;
      display: block;
      list-style-type: disc;
      margin-block-start: 1em;
      margin-block-end: 1em;
      margin-inline-start: 0px;
      margin-inline-end: 0px;
      padding-inline-start: 40px;

    }
    .tab-hd li {
      height: 60px;
    }
    .tab-hd li.cj a{
      background-position: right top;
    }
    .tab-hd li.cj.active a{
      background-position: left top;
    }
    .tab-hd li.yx a{
      background-position: right -67px;
    }
    .tab-hd li.yx.active a{
      background-position: left -67px;
    }
    .tab-hd li.qm a{
      background-position: right -134px;
    }
    .tab-hd li.qm.active a{
      background-position: left -134px;
    }
    .tab-hd li.dw a{
      background-position: right -200px;
    }
    .tab-hd li.dw.active a{
      background-position: left -200px;
    }
    .tab-hd li.qx a{
      background-position: right -267px;
    }
    .tab-hd li.qx.active a{
      background-position: left -267px;
    }
    .tab-hd li.zq a{
      background-position: right -335px;
    }
    .tab-hd li.zq.active a{
      background-position: left -335px;
    }
    .tab-hd li.cy a{
      background-position: right bottom;
    }
    .tab-hd li.cy.active a{
      background-position: left bottom;
    }
    li {
      line-height: 36px;
      list-style: none;
      //display: list-item;
    }

    .tab-hd li a {
      display: block;
      width: 125px;
      height: 35px;
      overflow: hidden;
      background: url('~@/assets/images/festivals/jrhz20180606-27.png') no-repeat left top;
    }
  }
}
</style>