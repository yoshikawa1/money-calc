function removeComma(input){
 let value = input.value;
 value = value.replace(/[^0-9０-９]/g, "");
 value = toHalfWidth(value);
 value = value.replace(/^0+/,'');
 value = value.replace(/(\d)(?=(\d{3})+$)/g, '$1,');
 input.value= value;
 return true;
};

  function toHalfWidth(input) {
    return input.replace(/[！-～]/g,
      function(input){
        return String.fromCharCode(input.charCodeAt(0)-0xFEE0);
      }
    );
  };
