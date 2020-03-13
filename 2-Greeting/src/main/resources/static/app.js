$('document').ready(function () {
  console.log('Document ready');
  $('button').click(function () {
    var name = $("#input").val();
    console.log(name)

    $.ajax({
      url: "/hello?name=" + name,
      success: function (result) {
        $(".result").html(result);
      }
    });
  })
})