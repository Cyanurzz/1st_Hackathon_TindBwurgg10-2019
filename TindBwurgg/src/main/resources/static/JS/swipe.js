//CAROUSEL
(function($) {
    "use strict";
    // manual carousel controls
    $('.next').click(function(){ $('.carousel').carousel('next');return false; });
    $('.prev').click(function(){ $('.carousel').carousel('prev');return false; });
    
})(jQuery);
$('.carousel').carousel({
    interval: 10000
});

$(".more-info-card").hide(); //Cache More Info sur ma page

$(document).ready(function(){ //Dépli les info supplémentaire
    $(".slideDown").click(function(){
      $(".more-info-card").slideDown();
      $(".topCard").slideUp();
      $(".choice").hide();
    });
  });

  $(document).ready(function(){ //range les infos supplémentaire
    $(".slideUp").click(function(){
      $(".more-info-card").slideUp();
      $(".topCard").slideDown();
    });
  });
  // Add delay on Alert open

  
$(".alert").show("slow").delay(5000).hide("slow");
