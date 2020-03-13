$('document').ready(function () {
  console.log('Document ready');
  $('button').click(function () {
    const a = $("#a").val();
    const b = $("#b").val();

    $.ajax({
      url: "/sum?a=" + a + "&b=" + b,
      crossDomain: true,
      success: function (result) {
        $(".result").html(
          "<h2> The sum is  " + result + "</h2>"
        );
      }
    });
  })
})