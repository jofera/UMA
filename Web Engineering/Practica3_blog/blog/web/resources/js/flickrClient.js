function singleImage(titulo, contenedor) {
    var apiKey = "76b006d6fcbb5e973254d93c7f39fa8c"; // replace this with your API key
    // get an array of random photos
    $.getJSON("https://api.flickr.com/services/rest/?jsoncallback=?", {
            method: 'flickr.photos.search',
            tags:  titulo + " ciudad",
            api_key: apiKey,
            format: 'json',
            per_page: 1
        },
        function(data) {
            // if everything went good
            if (data.stat == 'ok') {
                // get a random id from the array
                var photo = data.photos.photo[0]; //Math.floor(Math.random() * data.photos.photo.length)]; //esto se deberia cambair para obtener siempre la misma                        
                var url = "http://farm"+photo.farm+".staticflickr.com/"+photo.server+"/"+photo.id+"_"+photo.secret+"_t.jpg"; // t para thumbnail 
                var img = $("<img/>").attr("src", url);
                var a = $("<a/>").attr("href", url.replace("_t","")).attr("class", "g1");
                a.attr("title", "Ciudad de "+titulo);  
                a.append(img);                        
                $(contenedor).append(a);
            } else {
                console.log(" The request to get the array was not good :( ");
            }
        }
    );
};

function multiImage(titulo, contenedor) {
    var apiKey = "76b006d6fcbb5e973254d93c7f39fa8c"; // replace this with your API key
    // get an array of random photos
    $.getJSON("https://api.flickr.com/services/rest/?jsoncallback=?", {
            method: 'flickr.photos.search',
            tags: titulo + " ciudad",
            api_key: apiKey,
            format: 'json',
            per_page: 10
        },
        function(data) {
            // if everything went good
            if (data.stat == 'ok') {
                for (i=0; i<data.photos.photo.length || i < 10; i++) {
                    var photo = data.photos.photo[i]; //Math.floor(Math.random() * data.photos.photo.length)]; //esto se deberia cambair para obtener siempre la misma                        
                    var urlpre = "http://farm"+photo.farm+".staticflickr.com/"+photo.server+"/"+photo.id+"_"+photo.secret;   

                    var img = $("<img/>").attr("src", urlpre +"_z.jpg");
                    var a = $("<a/>").attr("href", urlpre + ".jpg").attr("class", "g1g");
                    //$(a).colorbox({rel:'g1'});
                    a.attr("title", "Ciudad de "+titulo);  
                    a.append(img);                        
                    $(contenedor).append(a);
                }                            
                $(".g1g").colorbox({rel:'g1g'});
            } else {
                console.log(" The request to get the array was not good :( ");
            }
        }
    );
};  