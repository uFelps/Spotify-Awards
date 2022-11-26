export type Album = {
    id: number;
    name: string;
    artist: string;
    duration: string;
    released: string;
    url: string;
    img: string;
    average: number;
    countVotes: number;
    songs: Array<string>;
}

export type AlbumPage = {
    content: Album[];
    last: boolean;
    totalPages: number;
    totalElements: number;
    size: number;
    number: number;
    first: boolean;
    numberOfElements: number;
    empty: boolean;
}