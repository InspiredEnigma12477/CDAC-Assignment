(function($){
    $.fn.highlight=function(backcolor,forecolor){
        return this.each(function(){
            $(this).css({
                "background-color":backcolor,
                "color":forecolor,
                "font-face":"bold"
            })
        })
    }
})($)