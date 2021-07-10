function newTyped(){}$(function(){$("#typed").typed({
		
    strings: ["UQ", "Australia", "all around"],

    typeSpeed:90,backDelay:700,contentType:"html",loop:!0,resetCallback:function(){newTyped()}}),$(".reset").click(function(){$("#typed").typed("reset")})});
